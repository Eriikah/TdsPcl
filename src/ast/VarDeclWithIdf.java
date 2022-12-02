package ast;

public class VarDeclWithIdf implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast Idf;
    public String typeid;
    public Ast expressions;

    public VarDeclWithIdf(Ast Idf, String typeid, Ast expressions) {
        this.Idf = Idf;
        this.typeid = typeid;
        this.expressions = expressions;
    }

}
