package semantique;

import java.util.ArrayList;

import ast.Ast;
import ast.MinusAffector;
import tds.Tds;

public class IntBehindMinusControl extends Control {

    private int ligne;

    public IntBehindMinusControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }

    @Override
    public int control() {
        int error = 0;
        if (ast instanceof MinusAffector) {
            MinusAffector minAst = (MinusAffector) ast;
            if (!getType(minAst.value).equals("int")) {
                System.err.println("Error at line " + this.ligne + " : " + "Cannot put "
                        + getType(minAst.value) + " after \"-\"");
                error++;
            }
        }
        return error;
    }
}
