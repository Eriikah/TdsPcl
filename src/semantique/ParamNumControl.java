package semantique;

import java.util.ArrayList;
import ast.Ast;
import ast.ExprList;
import ast.FunctionCall;
import tds.Tds;

public class ParamNumControl extends Control {

    private int ligne;

    public ParamNumControl(Ast ast, Tds tds, ArrayList<Tds> TdsList, int ligne) {
        super(ast, tds, TdsList);
        this.ligne = ligne;
    }

    public int control() {
        int error = 0;
        if (((FunctionCall) ast).Idf.name == "return") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 1 parameter, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "print") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 1 parameter, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "printi") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 1 parameter, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "flush") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 0) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 0 parameter, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "getchar") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 0) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 0 parameter, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "ord") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 1 parameter, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "chr") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 1 parameter, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "size") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 1 parameter, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "substring") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 3) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 3 parameters, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "concat") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 2) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 2 parameters, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "not") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 1 parameter, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "exit") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println("Error at line " + this.ligne + " : "
                        + ((FunctionCall) ast).Idf.name + " takes 1 parameter, you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else {
            tds.Function calledFunction =
                    (tds.Function) tds.getSymbol(((FunctionCall) ast).Idf.name);
            int parNum = 0;
            if ((ExprList) (((FunctionCall) ast).exprList) != null) {
                parNum = ((ExprList) (((FunctionCall) ast).exprList)).expressions.size();
            }
            if (calledFunction != null && calledFunction.getParamNumber() != parNum) {
                System.out.println(
                        "Error at line " + this.ligne + " : " + ((FunctionCall) ast).Idf.name
                                + " takes " + calledFunction.getParamNumber()
                                + " parameter(s), you submitted " + parNum);
                error++;
            }
        }

        return error;
    }

}
