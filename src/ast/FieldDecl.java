package ast;

import java.util.ArrayList;

public class FieldDecl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Idf> fieldIds;
    public ArrayList<Ast> fieldTypes;

    public FieldDecl(ArrayList<Idf> Ids, ArrayList<Ast> fieldElements) {
        this.fieldIds = Ids;
        this.fieldTypes = fieldElements;
    }

}
