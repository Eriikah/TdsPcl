package ast;

import java.util.ArrayList;

public class ExprSeq implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Ast> seqElement;

    public ExprSeq(ArrayList<Ast> seqElement) {
        this.seqElement = seqElement;
    }
}
