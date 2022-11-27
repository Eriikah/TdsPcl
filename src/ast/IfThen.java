package ast;

public class IfThen implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast ifExpr;
    public Ast expressions;

    public IfThen(Ast ifExpr, Ast expressions) {
        this.ifExpr = ifExpr;
        this.expressions = expressions;
    }

}
