package ast;

public class IntNode implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String value;

    public IntNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
