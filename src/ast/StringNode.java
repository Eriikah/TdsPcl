package ast;

public class StringNode implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String value;
    public Idf Idf;

    public StringNode(String value, Idf Idf) {
        this.value = value;
        this.Idf = Idf;
    }
}
