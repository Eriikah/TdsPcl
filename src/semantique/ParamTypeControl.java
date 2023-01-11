package semantique;

import java.util.ArrayList;
import ast.Ast;
import ast.FunctionCall;
import ast.ExprList;
import tds.Tds;

public class ParamTypeControl extends Control {

    public ParamTypeControl(Ast ast, Tds tds, ArrayList<Tds> TdsList) {
        super(ast, tds, TdsList);
    }

    public int control() {
        int error = 0;
        tds.Function tdsFunction = (tds.Function) tds.getSymbol(((FunctionCall) ast).Idf.name);
        if (tdsFunction != null) {
            ArrayList<Ast> paramList = ((ExprList) (((FunctionCall) ast).exprList)).expressions;
            for (int index = 0; index < tdsFunction.getParamNumber(); index++) {
                if (!tdsFunction.getParams().get(index).getType()
                        .equals(getType(paramList.get(index)))) {
                    System.out.print("Wrong type for parametter "
                            + tdsFunction.getParams().get(index).getName() + ". The type is "
                            + getType(paramList.get(index)) + "; Expected : "
                            + tdsFunction.getParams().get(index).getType() + "\n");
                    error++;
                }
            }
        }

        return error;
    }
}
