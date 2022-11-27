package ast;

public class NotIdf implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String value;

    public NotIdf(String value) {
        this.value = value;
    }

}
