package ast;

import java.util.ArrayList;

public class FieldDecl {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<FieldElement> fieldElements;

    public FieldDecl(ArrayList<FieldElement> fieldElements) {
        this.fieldElements = fieldElements;
    }

}
