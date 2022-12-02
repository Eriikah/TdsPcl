package ast;

public class FieldElement implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public TypeId typeid;

    public FieldElement(Idf Idf, TypeId typeid) {
        this.Idf = Idf;
        this.typeid = typeid;
    }
}
