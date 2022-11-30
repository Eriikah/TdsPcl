package ast;

public class Affect implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf idf;
    public Ast expression;

    public Affect(Idf idf, Ast expr) {
        this.idf = idf;
        this.expression = expr;
    }

}
