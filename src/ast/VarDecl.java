package ast;

public class VarDecl extends Decl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public FieldDecl fieldDecl;
    public TypeId typeId;
    public Ast expressions;

    public VarDecl(Idf Idf, FieldDecl fieldDecl, TypeId typeId, Ast expressions) {
        this.Idf = Idf;
        this.fieldDecl = fieldDecl;
        this.typeId = typeId;
        this.expressions = expressions;
    }

}
