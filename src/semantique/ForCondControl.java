package semantique;

import java.util.ArrayList;

import ast.*;
import tds.*;

public class ForCondControl extends Control {

    private int ligne;

    public ForCondControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }

    @Override
    public int control() {
        int nb_error = 0;

        if (this.ast instanceof For) {

            if (((For) this.ast).goalExpr instanceof Lvalue) {
                if (((For) this.ast).origExpr instanceof IntNode) {
                    String original = "int";
                    String goal = getType(((For) this.ast).goalExpr);

                    if (original != null && goal != null) {
                        if (!original.equals(goal)) {
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "For condition must be of the same type");
                            nb_error++;
                        }
                    }
                }
                if (((For) this.ast).origExpr instanceof StringNode) {
                    String original = "String";
                    String goal = getType(((For) this.ast).goalExpr);

                    if (original != null && goal != null) {
                        if (!original.equals(goal)) {
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "For condition must be of the same type");
                            nb_error++;
                        }
                    }
                }
            }

            if (((For) this.ast).origExpr instanceof Lvalue) {
                if (((For) this.ast).goalExpr instanceof IntNode) {
                    String goal = "int";
                    String original = getType(((For) this.ast).origExpr);

                    if (original != null && goal != null) {
                        if (!original.equals(goal)) {
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "For condition must be of the same type");
                            nb_error++;
                        }
                    }
                }
                if (((For) this.ast).goalExpr instanceof StringNode) {
                    String goal = "String";
                    String original = getType(((For) this.ast).origExpr);

                    if (original != null && goal != null) {
                        if (!original.equals(goal)) {
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "For condition must be of the same type");
                            nb_error++;
                        }
                    }
                }
            }

            if (((For) this.ast).origExpr instanceof IntNode
                    && ((For) this.ast).goalExpr instanceof StringNode) {
                System.out.println("Error at line " + this.ligne + " : "
                        + "For condition must be of the same type");
                nb_error++;
            }
            if (((For) this.ast).origExpr instanceof StringNode
                    && ((For) this.ast).goalExpr instanceof IntNode) {
                System.out.println("Error at line " + this.ligne + " : "
                        + "For condition must be of the same type");
                nb_error++;
            }
        }

        return nb_error;
    }

}
