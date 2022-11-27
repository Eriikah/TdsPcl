package ast;

public class VarDeclWithIdf implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String Idf;
    public String typeid;
    public Ast expressions;

    public VarDeclWithIdf(String Idf, String typeid, Ast expressions) {
        this.Idf = Idf;
        this.typeid = typeid;
        this.expressions = expressions;
    }

}
