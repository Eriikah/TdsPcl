package ast;

public class Not implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast value;

    public Not(Ast value) {
        this.value = value;
    }

}
