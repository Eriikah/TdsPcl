package ast;

public class FunctionCall implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public Ast exprList;

    public FunctionCall(Idf Idf, Ast exprList) {
        this.Idf = Idf;
        this.exprList = exprList;
    }

}
