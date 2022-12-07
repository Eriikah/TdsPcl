package ast;

import java.util.ArrayList;

public class DeclList extends Decl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Ast> declElement;

    public DeclList(ArrayList<Ast> declElement) {
        this.declElement = declElement;
    }

    public void addDecl(Ast elem) {
        declElement.add(elem);
    }

}
