package semantique;

import java.util.ArrayList;

import ast.Ast;
import ast.IfThen;
import tds.Tds;

public class IfThenTypeControl extends Control {

    private int ligne;

    public IfThenTypeControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }

    @Override
    public int control() {
        int error = 0;
        if (ast != null) {
            if (ast instanceof IfThen) {
                IfThen ifThen = (IfThen) ast;
                if (!getType(ifThen.ifExpr).equals("int")) {
                    System.err.println(
                            "ConditionError condition isn't an int, actual type: " + getType(ifThen.ifExpr)+ "at line "+this.ligne);
                    error++;
                }
                if (!getType(ifThen.expressions).equals("void")) {
                    System.err.println(
                            "ConditionError then expr isn't void, actual type: " + getType(ifThen.expressions)+ "at line "+this.ligne);
                    error++;
                }
            }

        }
        return error;
    }

}
