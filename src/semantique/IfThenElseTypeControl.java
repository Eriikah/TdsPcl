package semantique;

import java.util.ArrayList;

import ast.Ast;
import ast.IfThenElse;
import tds.Tds;

public class IfThenElseTypeControl extends Control {

    public IfThenElseTypeControl(Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        super(ast, tds, tdsList);
    }

    @Override
    public int control() {
        int error = 0;
        if (ast != null) {
            if (ast instanceof IfThenElse) {
                IfThenElse ifThenElse = (IfThenElse) ast;
                if (!getType(ifThenElse.expressions).equals(getType(ifThenElse.elseExpr))) {
                    System.err.println("Not same type of ");
                    error++;
                }
            }
        }
        return error;
    }

}
