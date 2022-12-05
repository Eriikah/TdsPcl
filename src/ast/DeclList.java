package ast;

import java.util.ArrayList;

public class DeclList extends Decl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Decl> declElement;

    public DeclList() {
        this.declElement = new ArrayList<>();
    }

    public void addDecl(Decl elem) {
        declElement.add(elem);
    }

}
