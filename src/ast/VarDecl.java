package ast;

public class VarDecl extends Decl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public TypeId typeId;
    public Ast expressions;

    public VarDecl(Idf Idf, TypeId typeId, Ast expressions) {
        this.Idf = Idf;
        this.typeId = typeId;
        this.expressions = expressions;
    }

}
