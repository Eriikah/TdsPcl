package ast;

public class Size implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String value;

    public Size(String value) {
        this.value = value;
    }

}
