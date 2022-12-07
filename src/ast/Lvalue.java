package ast;

import java.util.ArrayList;

public class Lvalue implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Idf Idf;
    public ArrayList<Ast> lvalueSubs;

    public Lvalue(Idf Idf, ArrayList<Ast> lvalueSubs) {
        this.Idf = Idf;
        this.lvalueSubs = lvalueSubs;
    }
}
