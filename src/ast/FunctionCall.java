package ast;

public class FunctionCall implements Ast {

    private int ligne;

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public Ast exprList;

    public FunctionCall(Idf Idf, Ast exprList, int ligne) {
        this.Idf = Idf;
        this.exprList = exprList;
        this.ligne = ligne;
    }

    public int getLigne() {
        return this.ligne;
    }

}
