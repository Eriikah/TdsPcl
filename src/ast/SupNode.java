package ast;

public class SupNode implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;

    public SupNode(Ast left, Ast right) {
        this.left = left;
        this.right = right;
    }

}
