package ast;

public class Return implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast expressions;

    public Return(Ast expressions) {
        this.expressions = expressions;
    }
}
