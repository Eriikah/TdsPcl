package semantique;

import java.util.ArrayList;
import ast.Affect;
import ast.AndNode;
import ast.Ast;
import ast.DiffNode;
import ast.Div;
import ast.EqNode;
import ast.ExprList;
import ast.For;
import tds.Tds;
import ast.FuncDecl;
import ast.InfEqNode;
import ast.InfNode;
import ast.Minus;
import ast.SupEqNode;
import ast.SupNode;
import ast.Plus;
import ast.Mult;
import ast.OrNode;

public class ReturnTypeControl extends Control {

    public ReturnTypeControl(Ast ast, Tds tds, ArrayList<Tds> TdsList) {
        super(ast, tds, TdsList);
    }

    public int control() {
        int error = 0;
        tds.Function tdsFunction = (tds.Function) tds.getSymbol(((FuncDecl) ast).Idf.name);
        String tdsType;
        if (tdsFunction.getReturnType() == null) {
            tdsType = "void";
        } else {
            tdsType = tdsFunction.getReturnType();
        }
        if (tdsFunction != null) {
            Ast funcBody = ((FuncDecl) ast).expressions;
            String bodyType = "";
            if (funcBody instanceof ExprList) {
                ArrayList<Ast> seq = ((ExprList) ((FuncDecl) ast).expressions).expressions;
                boolean hasType = false;
                int incr = seq.size() - 1;
                while (!hasType && incr >= 0) {
                    System.out.println(getType(seq.get(incr)));
                    if (!getType(seq.get(incr)).equals("void")) {
                        bodyType = getType(seq.get(incr));
                        hasType = true;
                    }
                    incr--;
                }
            } else {
                System.out.println(getType(funcBody));
                bodyType = getType(funcBody);
            }

            if (!tdsType.equals(bodyType)) {
                System.out.println("Wrong return type : \"" + bodyType + "\", "
                        + tdsFunction.getName() + " should return a " + tdsType);
                error++;
            }
        }
        return error;
    }
}
