package ast;

public class Program implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast expressions;
    private int ligne;

    public Program(Ast expressions, int ligne) {
        this.expressions = expressions;
        this.ligne = ligne;
    }

    public int getLigne() {
        return ligne;
    }
}
