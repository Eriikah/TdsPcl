package ast;

public class VarDecl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String Idf;
    public Ast expressions;

    public VarDecl(String Idf, Ast expressions) {
        this.Idf = Idf;
        this.expressions = expressions;
    }

}
