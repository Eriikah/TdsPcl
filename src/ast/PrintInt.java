package ast;

public class PrintInt implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast expressions;

    public PrintInt(Ast expressions) {
        this.expressions = expressions;
    }
}
