package ast;

public class LetNode implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast declList;
    public Ast exprSeq;

    public LetNode(Ast declList, Ast exprSeq) {
        this.declList = declList;
        this.exprSeq = exprSeq;
    }
}
