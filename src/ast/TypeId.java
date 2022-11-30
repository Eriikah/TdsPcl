package ast;

public class TypeId implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String value;

    public TypeId(String value) {
        this.value = value;
    }
}