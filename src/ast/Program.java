package ast;

public class Program implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast expressions;

    public Program(Ast expressions) {
        this.expressions = expressions;
    }
}
