package ast;

public class FieldElement implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String Idf;
    public String typeid;

    public FieldElement(String Idf, String typeid) {
        this.Idf = Idf;
        this.typeid = typeid;
    }
}
