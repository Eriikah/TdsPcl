package ast;

public class FunctionCall implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast ID;
    public Ast expr_list;

    public FunctionCall(Ast ID, Ast expr_list) {
        this.ID = ID;
        this.expr_list = expr_list;
    }

}