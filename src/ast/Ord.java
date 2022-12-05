package ast;

public class Ord implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public StringNode value;

    public Ord(StringNode value) {
        this.value = value;
    }
}
