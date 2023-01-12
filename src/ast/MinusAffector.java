package ast;

public class MinusAffector implements Ast {

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast value;

    public MinusAffector(Ast value) {
        this.value = value;
    }
}
