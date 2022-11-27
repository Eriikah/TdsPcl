package ast;

public class IfThenElse implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast ifExpr;
    public Ast expressions;
    public Ast elseExpr;

    public IfThenElse(Ast ifExpr, Ast expressions, Ast elseExpr) {
        this.ifExpr = ifExpr;
        this.expressions = expressions;
        this.elseExpr = elseExpr;
    }

}
