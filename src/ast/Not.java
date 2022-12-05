package ast;

public class Not implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public IntNode value;

    public Not(IntNode value) {
        this.value = value;
    }

}
