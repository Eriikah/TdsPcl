package ast;

public class TypeField implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String Id;
    public String typeId;
    private int ligne;

    public TypeField(String Id, String typeId, int ligne) {
        this.Id = Id;
        this.typeId = typeId;
        this.ligne = ligne;
    }

    public int getLigne() {
        return this.ligne;
    }
}
