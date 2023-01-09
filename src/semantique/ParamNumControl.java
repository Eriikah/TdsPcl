package semantique;

import java.io.Console;
import java.util.ArrayList;
import java.util.function.Function;
import ast.Ast;
import ast.ExprList;
import ast.FunctionCall;
import tds.Tds;

public class ParamNumControl extends Control {

    public ParamNumControl(Ast ast, Tds tds, ArrayList<Tds> TdsList) {
        super(ast, tds, TdsList);
    }

    public int control() {
        if (((FunctionCall) ast).Idf.name == "return") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 1 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "print") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 1 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "printi") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 1 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "flush") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 0) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 0 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "getchar") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 0) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 0 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "ord") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 1 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "chr") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 1 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "size") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 1 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "substring") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 3) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 3 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "concat") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 2) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 2 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "not") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 1 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else if (((FunctionCall) ast).Idf.name == "exit") {
            if (((ExprList) (((FunctionCall) ast).exprList)).expressions.size() != 1) {
                System.out.println(
                        ((FunctionCall) ast).Idf.name + " takes 1 parametter, you submitted "
                                + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        else {
            tds.Function calledFunction =
                    (tds.Function) tds.getSymbol(((FunctionCall) ast).Idf.name);
            if (calledFunction
                    .getParamNumber() != ((ExprList) (((FunctionCall) ast).exprList)).expressions
                            .size()) {
                System.out.println(((FunctionCall) ast).Idf.name + " takes "
                        + calledFunction.getParamNumber() + " parametter(s), you submitted "
                        + ((ExprList) (((FunctionCall) ast).exprList)).expressions.size());
            }
        }

        return 0;
    }

}
