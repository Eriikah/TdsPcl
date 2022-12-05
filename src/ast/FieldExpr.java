package ast;

public class FieldExpr extends LvalueSub {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;

    public FieldExpr(Idf Idf) {
        this.Idf = Idf;
    }
}
