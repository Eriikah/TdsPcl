package ast;

public class TypeId implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String value;
    private int ligne;

    public TypeId(String value, int ligne) {
        this.value = value;
        this.ligne = ligne;
    }

    public String getValue() {
        return value;
    }

    public int getLigne() {
        return this.ligne;
    }
}