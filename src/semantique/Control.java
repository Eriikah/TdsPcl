package semantique;

import java.util.ArrayList;
import tds.*;
import ast.*;

public class Control {
    protected Tds tds;
    protected Ast ast;
    protected ArrayList<Tds> tdsList;

    public Control(Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        this.ast = ast;
        this.tds = tds;
        this.tdsList = tdsList;
    }

    public int control() {
        return 0;
    }

    public String getType(String name) {
        Tds tds_current = this.tds;

        if (tds_current == null) {
            System.out.println("Tds null");
            return null;
        }

        Symbol symbol = tds_current.getSymbol(name);
        while (symbol == null) {
            tds_current = tds_current.getParent();
            if (tds_current == null) {
                System.out.println("Tds null" + name);
                return null;
            }
            symbol = tds_current.getSymbol(name);
        }

        if (symbol instanceof Function) {
            return ((Function) symbol).getReturnType();
        } else if (symbol instanceof Var) {
            return ((Var) symbol).getType();
        } else if (symbol instanceof Param) {
            return ((Param) symbol).getType();
        } else {
            return null;
        }
    }

    public Tds getTds(String name) {
        for (Tds tds : this.tdsList) {
            if (tds.getName().equals(name)) {
                return tds;
            }
        }
        return null;
    }

    public String getType(Ast ast) {

        if (ast instanceof Div || ast instanceof Plus || ast instanceof Minus || ast instanceof Mult
                || ast instanceof EqNode || ast instanceof DiffNode || ast instanceof InfEqNode
                || ast instanceof InfNode || ast instanceof SupEqNode || ast instanceof SupNode) {
            return "int";
        }
        if (ast instanceof AndNode || ast instanceof OrNode) {
            return "int";
        }
        if (ast instanceof FunctionCall) {
            FunctionCall call = (FunctionCall) ast;
            return getType(call.Idf.name);
        }
        if (ast instanceof PrintExpr || ast instanceof PrintInt || ast instanceof Flush
                || ast instanceof Exit) {
            return "void";
        }
        if (ast instanceof GetChar || ast instanceof Chr || ast instanceof Substring
                || ast instanceof Concat) {
            return "String";
        }
        if (ast instanceof Ord || ast instanceof Size || ast instanceof Not) {
            return "int";
        }
        if (ast instanceof Affect) {
            Affect affect = (Affect) ast;
            return getType(affect.left);
        }
        if (ast instanceof For) {
            For forAst = (For) ast;
            return getType(forAst.expressions);
        }
        if (ast instanceof Return) {
            Return retAst = (Return) ast;
            return getType(retAst.expressions);
        }
        if (ast instanceof IntNode) {
            return "int";
        }
        if (ast instanceof Idf) {
            Idf idAst = (Idf) ast;
            return getType(idAst.name);
        }
        if (ast instanceof ExprList) {
            String type = "";
            for (Ast elAst : ((ExprList) ast).expressions) {
                type = getType(elAst);
            }
            return type;
        }
        if (ast instanceof Lvalue) {
            return getType(((Lvalue) ast).Idf.name);
        }
        if (ast instanceof StringNode) {
            return "String";
        }
        if (ast instanceof For) {
            return getType(((For) ast).expressions);
        }
        if (ast instanceof IfThen) {
            return "void";
        }
        if (ast instanceof IfThenElse) {
            return getType(((IfThenElse) ast).expressions);
        }
        if (ast instanceof FuncDecl) {
            return getType(((FuncDecl) ast).expressions);
        }
        if (ast instanceof VarDecl) {
            return getType(((VarDecl) ast).typeId);
        }
        if (ast instanceof Subscript) {
            return getType(((Subscript) ast).expression);
        }
        if (ast instanceof FieldExpr) {
            return getType(((FieldExpr) ast).Idf);
        }
        if (ast instanceof While) {
            return "void";
        }
        if (ast instanceof While) {
            return "void";
        }
        if (ast instanceof Break) {
            return "void";
        }
        if (ast instanceof LetNode) {
            if (((LetNode) ast).exprSeq != null) {
                return getType(((LetNode) ast).exprSeq);
            }
            return "void";
        }

        return null;
    }
}
