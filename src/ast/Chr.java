package ast;

public class Chr implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public IntNode value;

    public Chr(IntNode value) {
        this.value = value;
    }

}
