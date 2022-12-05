package ast;

public class IntNode implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public int value;
    public Idf Idf;

    public IntNode(int value, Idf Idf) {
        this.value = value;
        this.Idf = Idf;
    }
}
