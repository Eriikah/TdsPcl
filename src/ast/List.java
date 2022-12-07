package ast;

public class List implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast fieldCreate;

    public List(Ast typeid, Ast fieldCreate) {
        this.typeid = typeid;
        this.fieldCreate = fieldCreate;
    }
}