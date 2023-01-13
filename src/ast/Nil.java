package ast;

public class Nil implements Ast {

    public Nil() {}

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
