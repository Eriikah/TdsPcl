package semantique;

import ast.*;
import tds.*;

import java.util.ArrayList;

public class TypeIndexListControl extends Control {

    private int ligne;

    public TypeIndexListControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }

    @Override
    public int control() {
        int nb_error = 0;

        if (this.ast instanceof ListDecl) {
            if (((ListDecl) this.ast).list instanceof StringNode) {
                System.out.println(
                        "Error at line " + this.ligne + " : List index must be an integer");
                nb_error++;
            }
            if (((ListDecl) this.ast).list instanceof Lvalue) {
                String type = getType((Lvalue) ((ListDecl) this.ast).list);
                if (!type.equals("int")) {
                    System.out.println(
                            "Error at line " + this.ligne + ": List index must be an integer");
                    nb_error++;
                }
            }
        }

        return nb_error;
    }

}
