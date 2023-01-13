package ast;

public class FuncDecl extends Decl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public Ast fieldDecl;
    public Ast typeId;
    public Ast expressions;
    private int ligne;

    public FuncDecl(Idf Idf, Ast fieldDecl, Ast typeId, Ast expressions, int ligne) {
        this.Idf = Idf;
        this.fieldDecl = fieldDecl;
        this.typeId = typeId;
        this.expressions = expressions;
        this.ligne = ligne;
    }

    public int getLigne() {
        return this.ligne;
    }

}
