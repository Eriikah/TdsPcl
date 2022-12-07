package ast;

public class TypeField implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String Id;
    public String typeId;

    public TypeField(String Id, String typeId) {
        this.Id = Id;
        this.typeId = typeId;
    }
}
