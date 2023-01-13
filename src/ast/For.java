package ast;

public class For implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public Ast origExpr;
    public Ast goalExpr;
    public Ast expressions;
    private int ligne;

    public For(Idf Idf, Ast origExpr, Ast goalExpr, Ast expressions, int ligne) {
        this.Idf = Idf;
        this.origExpr = origExpr;
        this.goalExpr = goalExpr;
        this.expressions = expressions;
        this.ligne = ligne;
    }

    public int getLigne() {
        return ligne;
    }

}
