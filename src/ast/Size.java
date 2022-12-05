package ast;

public class Size implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public StringNode value;

    public Size(StringNode value) {
        this.value = value;
    }

}
