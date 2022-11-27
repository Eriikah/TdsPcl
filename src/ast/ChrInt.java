package ast;

public class ChrInt implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public int value;

    public ChrInt(int value) {
        this.value = value;
    }

}
