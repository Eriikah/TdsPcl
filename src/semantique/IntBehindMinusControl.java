package semantique;

import java.util.ArrayList;

import ast.Ast;
import ast.MinusAffector;
import tds.Tds;

public class IntBehindMinusControl extends Control {

    public IntBehindMinusControl(Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        super(ast, tds, tdsList);
    }

    @Override
    public int control() {
        int error = 0;
        if (ast instanceof MinusAffector) {
            MinusAffector minAst = (MinusAffector) ast;
            if (!getType(minAst.value).equals("int")) {
                System.err.println("Error Cannot put " + getType(minAst.value) + " after \"-\"");
                error++;
            }
        }
        return error;
    }
}
