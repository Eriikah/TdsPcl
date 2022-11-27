package ast;

public class Print implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String value;

    public Print(String value) {
        this.value = value;
    }
}
