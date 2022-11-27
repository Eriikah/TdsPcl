package ast;

public class FuncDeclWithIdf implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String Idf;
    public Ast fieldDecl;
    public String typeid;
    public Ast expressions;

    public FuncDeclWithIdf(String Idf, Ast fieldDecl, String typeid, Ast expressions) {
        this.Idf = Idf;
        this.fieldDecl = fieldDecl;
        this.typeid = typeid;
        this.expressions = expressions;
    }

}
