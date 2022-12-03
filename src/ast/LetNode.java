package ast;

public class LetNode implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public DeclList declList;
    public ExprSeq exprSeq;

    public LetNode(DeclList declList, ExprSeq exprSeq) {
        this.declList = declList;
        this.exprSeq = exprSeq;
    }
}
