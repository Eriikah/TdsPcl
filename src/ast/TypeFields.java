package ast;

public class TypeFields implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public TypeDecl typeDecl;
    public TypeFields typeFields;

    public TypeFields(TypeDecl typeDecl, TypeFields typeFields) {
        this.typeDecl = typeDecl;
        this.typeFields = typeFields;
    }
}
