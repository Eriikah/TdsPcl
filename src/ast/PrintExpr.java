package ast;

public class PrintExpr implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast expressions;

    public PrintExpr(Ast expressions) {
        this.expressions = expressions;
    }
}
