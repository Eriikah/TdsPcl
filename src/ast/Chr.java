package ast;

public class Chr implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String value;

    public Chr(String value) {
        this.value = value;
    }

}
