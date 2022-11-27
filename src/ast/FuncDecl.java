package ast;

public class FuncDecl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String Idf;
    public Ast fieldDecl;
    public Ast expressions;

    public FuncDecl(String Idf, Ast fieldDecl, Ast expressions) {
        this.Idf = Idf;
        this.fieldDecl = fieldDecl;
        this.expressions = expressions;
    }

}
