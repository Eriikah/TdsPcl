package semantique;

import java.util.ArrayList;
import ast.Ast;
import ast.FieldDecl;
import ast.IntNode;
import ast.List;
import ast.Nil;
import ast.StringNode;
import ast.TypeId;
import ast.VarDecl;
import tds.Tds;

class VarDeclRecordControl extends Control {

    private int ligne;

    public VarDeclRecordControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }

    public int control() {
        int error = 0;
        VarDecl decl = ((VarDecl) ast);
        if (tds.getSymbol(((TypeId) decl.typeId).value) instanceof tds.Record) {
            ArrayList<tds.Var> vars =
                    ((tds.Record) tds.getSymbol(((TypeId) decl.typeId).value)).getContent();
            ArrayList<Ast> typeList =
                    ((FieldDecl) ((List) decl.expressions).fieldCreate).fieldTypes;
            if (vars.size() != typeList.size()) {
                System.out
                        .println("Error at line " + this.ligne + " : "
                                + ((tds.Record) tds.getSymbol(((TypeId) decl.typeId).value))
                                        .getName()
                                + " should be declared with " + vars.size() + " elements, not "
                                + typeList.size());
                error++;
            }
            if (error == 0) {
                for (int index = 0; index < vars.size(); index++) {
                    String varType = "";
                    if (typeList.get(index) instanceof IntNode) {
                        varType = "int";
                    } else if (typeList.get(index) instanceof StringNode) {
                        varType = "string";
                    } else if (typeList.get(index) instanceof Nil) {
                        varType = "void";
                    } else {
                        varType = ((TypeId) typeList.get(index)).value;
                    }
                    if (!varType.equals("void") && !vars.get(index).getType().equals(varType)) {
                        System.out.println(
                                "Error at line " + this.ligne + " : " + vars.get(index).getName()
                                        + " should be a " + vars.get(index).getType());
                        error++;
                    }
                }
            }
        }

        return error;
    }
}
