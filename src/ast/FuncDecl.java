package ast;

public class FuncDecl extends Decl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public FieldDecl fieldDecl;
    public Ast expressions;

    public FuncDecl(Idf Idf, FieldDecl fieldDecl, Ast expressions) {
        this.Idf = Idf;
        this.fieldDecl = fieldDecl;
        this.expressions = expressions;
    }

}
