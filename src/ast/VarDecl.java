package ast;

public class VarDecl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast Idf;
    public Ast expressions;

    public VarDecl(Ast Idf, Ast expressions) {
        this.Idf = Idf;
        this.expressions = expressions;
    }

}
