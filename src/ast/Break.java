package ast;

public class Break implements Ast {

    public Break() {
    }

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
