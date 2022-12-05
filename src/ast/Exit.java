package ast;

public class Exit implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public IntNode value;

    public Exit(IntNode value) {
        this.value = value;
    }

}
