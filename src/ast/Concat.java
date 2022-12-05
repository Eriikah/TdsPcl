package ast;

public class Concat implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String leftString;
    public String righString;

    public Concat(String leftString, String rightString) {
        this.leftString = leftString;
        this.righString = rightString;
    }
}
