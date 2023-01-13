package ast;

public class Div implements Ast {

    private int ligne;

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;

    public Div(Ast left, Ast right, int ligne) {
        this.left = left;
        this.right = right;
        this.ligne = ligne;
    }

    public int getLigne() {
        return this.ligne;
    }

}
