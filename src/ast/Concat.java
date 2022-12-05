package ast;

public class Concat {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public StringNode leftString;
    public StringNode righString;

    public Concat(StringNode leftString, StringNode rightString) {
        this.leftString = leftString;
        this.righString = rightString;
    }
}
