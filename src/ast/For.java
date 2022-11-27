package ast;

public class For implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String Idf;
    public Ast origExpr;
    public Ast goalExpr;
    public Ast expressions;

    public For(String Idf, Ast origExpr, Ast goalExpr, Ast expressions) {
        this.Idf = Idf;
        this.origExpr = origExpr;
        this.goalExpr = goalExpr;
        this.expressions = expressions;
    }

}
