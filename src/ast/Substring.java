package ast;

public class Substring implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public StringNode string;
    public IntNode index;
    public IntNode length;

    public Substring(StringNode string, IntNode index, IntNode length) {
        this.string = string;
        this.index = index;
        this.length = length;
    }
}
