package ast;

public class FuncDecl extends Decl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public Ast fieldDecl;
    public Ast typeId;
    public Ast expressions;

    public FuncDecl(Idf Idf, Ast fieldDecl, Ast typeId, Ast expressions) {
        this.Idf = Idf;
        this.fieldDecl = fieldDecl;
        this.typeId = typeId;
        this.expressions = expressions;
    }

}
