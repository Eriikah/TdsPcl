package ast;

public class FunctionCall implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public ExprList exprList;

    public FunctionCall(Idf Idf, ExprList exprList) {
        this.Idf = Idf;
        this.exprList = exprList;
    }

}
