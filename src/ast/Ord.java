package ast;

public class Ord implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String value;

    public Ord(String value) {
        this.value = value;
    }
}
