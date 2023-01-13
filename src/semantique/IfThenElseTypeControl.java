package semantique;

import java.util.ArrayList;

import ast.Ast;
import ast.IfThenElse;
import tds.Tds;

public class IfThenElseTypeControl extends Control {

    private int ligne;

    public IfThenElseTypeControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }

    @Override
    public int control() {
        int error = 0;
        if (ast != null) {
            if (ast instanceof IfThenElse) {
                IfThenElse ifThenElse = (IfThenElse) ast;
                if (!getType(ifThenElse.expressions).equals(getType(ifThenElse.elseExpr))) {
                    System.err.println("Not same type : then expr returns " + getType(ifThenElse.expressions)
                            + " whereas else returns " + getType(ifThenElse.elseExpr)+ "at line "+this.ligne);
                    error++;
                }
                if (!getType(ifThenElse.ifExpr).equals("int")) {
                    System.err.println(
                            "ConditionError condition isn't an int, actual type: " + getType(ifThenElse.ifExpr)+ "at line "+this.ligne);
                    error++;
                }
            }
        }
        return error;
    }

}
