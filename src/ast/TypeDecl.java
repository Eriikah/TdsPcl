package ast;

public class TypeDecl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast type;

    public TypeDecl(Ast typeid, Ast type) {
        this.typeid = typeid;
        this.type = type;
    }

}
