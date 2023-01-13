package ast;

public class IfThenElse implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast ifExpr;
    public Ast expressions;
    public Ast elseExpr;
    private int ligne;

    public IfThenElse(Ast ifExpr, Ast expressions, Ast elseExpr, int ligne) {
        this.ifExpr = ifExpr;
        this.expressions = expressions;
        this.elseExpr = elseExpr;
        this.ligne = ligne;
    }

    public int getLigne() {
        return ligne;
    }

}
