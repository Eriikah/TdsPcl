package ast;

import java.util.ArrayList;

public class FieldDecl implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<String> fieldIds;
    public ArrayList<Ast> fieldTypes;

    public FieldDecl(ArrayList<String> fieldIds, ArrayList<Ast> fieldTypes) {
        this.fieldIds = fieldIds;
        this.fieldTypes = fieldTypes;
    }

}
