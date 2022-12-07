package ast;

import java.util.ArrayList;

public class TypeFields implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Ast> typeField;

    public TypeFields(ArrayList<Ast> typeField) {
        this.typeField = typeField;
    }
}
