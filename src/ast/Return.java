package ast;

public class Return implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ExprList expressions;

    public Return(ExprList expressions) {
        this.expressions = expressions;
    }
}
