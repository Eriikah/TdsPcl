package ast;

public class PrintInt implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast value;

    public PrintInt(Ast value) {
        this.value = value;
    }
}
