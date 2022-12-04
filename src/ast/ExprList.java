package ast;

import java.util.ArrayList;

public class ExprList implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Ast> expressions;

    public ExprList() {
        this.expressions = new ArrayList<Ast>();
    }

    public void addExpr(Ast expr) {
        expressions.add(expr);
    }
}
