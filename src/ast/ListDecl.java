package ast;

public class ListDecl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast typeId;
    public Ast list;
    public Ast ofexpr;
    private int ligne;

    public ListDecl(Ast typeId, Ast list, Ast ofexpr, int ligne) {
        this.typeId = typeId;
        this.list = list;
        this.ofexpr = ofexpr;
        this.ligne = ligne;
    }

    public int getLigne() {
        return this.ligne;
    }
}
