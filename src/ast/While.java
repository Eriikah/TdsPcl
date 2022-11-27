package ast;

public class While implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast cond;
    public Ast expressions;

    public While(Ast cond, Ast expressions) {
        this.cond = cond;
        this.expressions = expressions;
    }
}
