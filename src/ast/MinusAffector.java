package ast;

public class MinusAffector implements Ast {

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    private int ligne;
    public Ast value;

    public MinusAffector(Ast value, int ligne) {
        this.value = value;
        this.ligne = ligne;
    }

    public int getLigne() {
        return ligne;
    }
}
