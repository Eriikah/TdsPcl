package ast;

public class TypeDecl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String typeid;
    public String type;

    public TypeDecl(String typeid, String type) {
        this.typeid = typeid;
        this.type = type;
    }

}
