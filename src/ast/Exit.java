package ast;

public class Exit implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public int value;

    public Exit(int value) {
        this.value = value;
    }

}
