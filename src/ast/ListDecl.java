package ast;

public class ListDecl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast typeId;
    public Ast list;
    public Ast ofexpr;

    public ListDecl(Ast typeId, Ast list, Ast ofexpr) {
        this.typeId = typeId;
        this.list = list;
        this.ofexpr = ofexpr;
    }
}
