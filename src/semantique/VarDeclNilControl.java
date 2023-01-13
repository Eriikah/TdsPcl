package semantique;

import java.util.ArrayList;
import ast.Ast;
import ast.Nil;
import ast.VarDecl;
import tds.Tds;

public class VarDeclNilControl extends Control {

    public VarDeclNilControl(Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        super(ast, tds, tdsList);
    }

    public int control() {
        int error = 0;
        VarDecl decl = ((VarDecl) ast);
        if (decl.typeId.value == null && decl.expressions instanceof Nil) {
            System.out.println("Variable " + decl.Idf.name
                    + " can't be initialized as nil without stating it's type.");
            error++;
        }
        return error;
    }
}
