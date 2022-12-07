package ast;

public class Substring implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String string;
    public String index;
    public String length;

    public Substring(String string, String index, String length) {
        this.string = string;
        this.index = index;
        this.length = length;
    }
}
