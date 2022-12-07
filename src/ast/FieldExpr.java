package ast;

public class FieldExpr extends LvalueSub {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String Idf;

    public FieldExpr(String Idf) {
        this.Idf = Idf;
    }
}
