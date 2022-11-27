package ast;

public class OrNode implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;

    public OrNode(Ast left, Ast right) {
        this.left = left;
        this.right = right;
    }

}
