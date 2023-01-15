package semantique;

import java.util.ArrayList;
import ast.Ast;
import ast.Nil;
import ast.VarDecl;
import tds.Tds;

public class VarDeclNilControl extends Control {

    private int ligne;

    public VarDeclNilControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }

    public int control() {
        int error = 0;
        VarDecl decl = ((VarDecl) ast);
        if (decl.typeId.value == null && decl.expressions instanceof Nil) {
            System.out.println("Error at line " + this.ligne + " : Variable " + decl.Idf.name
                    + " can't be initialized as nil without stating it's type at line "
                    + this.ligne);
            error++;
        }
        return error;
    }
}
