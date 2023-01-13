package semantique;

import java.util.ArrayList;
import ast.Ast;
import ast.ExprList;
import tds.Tds;
import ast.FuncDecl;

public class ReturnTypeControl extends Control {

    private int ligne;

    public ReturnTypeControl(Ast ast, Tds tds, ArrayList<Tds> TdsList, int ligne) {
        super(ast, tds, TdsList);
        this.ligne = ligne;
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
                    if (!getType(seq.get(incr)).equals("void")) {
                        bodyType = getType(seq.get(incr));
                        hasType = true;
                    }
                    incr--;
                }
                if (!hasType) {
                    bodyType = "void";
                }
            } else {
                bodyType = getType(funcBody);
            }

            if (!tdsType.equals(bodyType)) {
                System.out.println("Wrong return type at line "+this.ligne+" : \"" + bodyType + "\", "
                        + tdsFunction.getName() + " should return a " + tdsType);
                error++;
            }
        }
        return error;
    }
}
