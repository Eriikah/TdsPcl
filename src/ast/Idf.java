package ast;

public class Idf implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    private int ligne;
    public String name;

    public Idf(String name, int ligne) {
        this.name = name;
        this.ligne = ligne;
    }

    public int getLigne() {
        return this.ligne;
    }
}
