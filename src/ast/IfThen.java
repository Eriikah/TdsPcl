package ast;

public class IfThen implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast ifExpr;
    public Ast expressions;
    private int ligne;

    public IfThen(Ast ifExpr, Ast expressions, int ligne) {
        this.ifExpr = ifExpr;
        this.expressions = expressions;
        this.ligne = ligne;
    }

    public int getLigne() {
        return ligne;
    }

}
