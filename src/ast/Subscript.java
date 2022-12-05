package ast;

public class Subscript extends LvalueSub {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast expression;

    public Subscript(Ast expression) {
        this.expression = expression;
    }
}
