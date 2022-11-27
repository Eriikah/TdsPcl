package ast;

public class ExitIdf implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String value;

    public ExitIdf(String value) {
        this.value = value;
    }

}
