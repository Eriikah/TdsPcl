package semantique;

import ast.*;
import tds.*;

import java.util.ArrayList;

public class TypeOfExprListControl extends Control {

    private int ligne;

    public TypeOfExprListControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }

    @Override
    public int control() {
        int nb_error = 0;

        if (this.ast instanceof ListDecl) {
            String type = ((TypeId) ((ListDecl) this.ast).typeId).getValue();

            if (type.equals("intArray")) {
                if (!(((ListDecl) this.ast).ofexpr instanceof IntNode)) {
                    System.out.println(
                            "Error at line " + this.ligne + " : List must contain integers");
                    nb_error++;
                }
            }

            if (type.equals("stringArray")) {
                if (!(((ListDecl) this.ast).ofexpr instanceof StringNode)) {
                    System.out.println(
                            "Error at line " + this.ligne + " : List must contain strings");
                    nb_error++;
                }
            }

        }

        return nb_error;
    }

}
