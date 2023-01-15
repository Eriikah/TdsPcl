package semantique;

import ast.*;
import tds.*;

import java.util.ArrayList;

public class BinOpTypeControl extends Control {

    private int ligne;

    public BinOpTypeControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }

    @Override
    public int control() {
        int nb_error = 0;
        if (this.ast instanceof SupNode) {
            if (((SupNode) this.ast).left instanceof Nil
                    || ((SupNode) this.ast).right instanceof Nil) {
                System.out.println(
                        "Error at line " + this.ligne + " : Unauthorized comparaison for \"nil\"");
                nb_error++;
            }
            if (((SupNode) this.ast).left instanceof Lvalue
                    && ((SupNode) this.ast).right instanceof Lvalue) {
                String type_left = getType(((SupNode) this.ast).left);
                String type_right = getType(((SupNode) this.ast).right);

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("int") || !type_right.equals("String")
                            || !type_left.equals("int") || !type_left.equals("String")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "SupNode must have two operands of the same type");
                        }
                    }
                }
            }
            if (((SupNode) this.ast).left instanceof Lvalue
                    && !(((SupNode) this.ast).right instanceof IntNode)
                    && !(((SupNode) this.ast).right instanceof Lvalue)) {
                String type_left = getType(((SupNode) this.ast).left);
                if (type_left != null) {
                    nb_error++;
                    System.out.println("Error at line " + this.ligne + " : "
                            + "SupNode must have two operands of the same type");

                }
            }
        }

        if (this.ast instanceof InfNode) {
            if (((InfNode) this.ast).left instanceof Nil
                    || ((InfNode) this.ast).right instanceof Nil) {
                System.out.println(
                        "Error at line " + this.ligne + " : Unauthorized comparaison for \"nil\"");
                nb_error++;
            }
            if (((InfNode) this.ast).left instanceof Lvalue
                    && ((InfNode) this.ast).right instanceof Lvalue) {
                String type_left = getType(((InfNode) this.ast).left);
                String type_right = getType(((InfNode) this.ast).right);

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("int") || !type_right.equals("String")
                            || !type_left.equals("int") || !type_left.equals("String")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne
                                    + " : InfNode must have two operands of the same type");
                        }
                    }
                }
            }
            if (((InfNode) this.ast).left instanceof Lvalue
                    && !(((InfNode) this.ast).right instanceof IntNode)
                    && !(((InfNode) this.ast).right instanceof Lvalue)) {
                String type_left = getType(((InfNode) this.ast).left);
                if (type_left != null) {
                    nb_error++;
                    System.out.println("Error at line " + this.ligne + " : "
                            + "InfNode must have two operands of the same type");

                }
            }

        }

        if (this.ast instanceof SupEqNode) {
            if (((SupEqNode) this.ast).left instanceof Nil
                    || ((SupEqNode) this.ast).right instanceof Nil) {
                System.out.println(
                        "Error at line " + this.ligne + " : Unauthorized comparaison for \"nil\"");
                nb_error++;
            }
            if (((SupEqNode) this.ast).left instanceof Lvalue
                    && ((SupEqNode) this.ast).right instanceof Lvalue) {
                String type_left = getType(((SupEqNode) this.ast).left);
                String type_right = getType(((SupEqNode) this.ast).right);

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("int") || !type_right.equals("String")
                            || !type_left.equals("int") || !type_left.equals("String")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "SupEqNode must have two operands of the same type");
                        }
                    }
                }
            }
            if (((SupEqNode) this.ast).left instanceof Lvalue
                    && !(((SupEqNode) this.ast).right instanceof IntNode)
                    && !(((SupEqNode) this.ast).right instanceof Lvalue)) {
                String type_left = getType(((SupEqNode) this.ast).left);
                if (type_left != null) {
                    nb_error++;
                    System.out.println("Error at line " + this.ligne + " : "
                            + "SupEqNode must have two operands of the same type");

                }
            }
        }

        if (this.ast instanceof InfEqNode) {
            if (((InfEqNode) this.ast).left instanceof Nil
                    || ((InfEqNode) this.ast).right instanceof Nil) {
                System.out.println(
                        "Error at line " + this.ligne + " : Unauthorized comparaison for \"nil\"");
                nb_error++;
            }
            if (((InfEqNode) this.ast).left instanceof Lvalue
                    && ((InfEqNode) this.ast).right instanceof Lvalue) {
                String type_left = getType(((InfEqNode) this.ast).left);
                String type_right = getType(((InfEqNode) this.ast).right);

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("int") || !type_right.equals("String")
                            || !type_left.equals("int") || !type_left.equals("String")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "InfEqNode must have two operands of the same type");
                        }
                    }
                }
            }
            if (((InfEqNode) this.ast).left instanceof Lvalue
                    && !(((InfEqNode) this.ast).right instanceof IntNode)
                    && !(((InfEqNode) this.ast).right instanceof Lvalue)) {
                String type_left = getType(((InfEqNode) this.ast).left);
                if (type_left != null) {
                    nb_error++;
                    System.out.println("Error at line " + this.ligne + " : "
                            + "InfEqNode must have two operands of the same type");

                }
            }
        }

        if (this.ast instanceof EqNode) {
            if (((EqNode) this.ast).left instanceof Nil
                    && ((EqNode) this.ast).right instanceof Nil) {
                System.out.println("Error at line " + this.ligne
                        + " : Unauthorized comparaison between \"nil\" and \"nil\"");
                nb_error++;
            }
            if (((EqNode) this.ast).left instanceof Lvalue
                    && ((EqNode) this.ast).right instanceof Lvalue) {
                String type_right;
                String type_left;
                if (((EqNode) this.ast).left instanceof Nil) {
                    type_left = "void";
                } else {
                    type_left = getType(((EqNode) this.ast).left);
                }
                if (((EqNode) this.ast).right instanceof Nil) {
                    type_right = "void";
                } else {
                    type_right = getType(((EqNode) this.ast).right);
                }

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("int") || !type_right.equals("String")
                            || !type_left.equals("int") || !type_left.equals("String")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "EqNode must have two operands of the same type");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof DiffNode) {
            if (((DiffNode) this.ast).left instanceof Nil
                    && ((DiffNode) this.ast).right instanceof Nil) {
                System.out.println("Error at line " + this.ligne
                        + " : Unauthorized comparaison between \"nil\" and \"nil\"");
                nb_error++;
            }
            if (((DiffNode) this.ast).left instanceof Lvalue
                    && ((DiffNode) this.ast).right instanceof Lvalue) {
                String type_right;
                String type_left;
                if (((DiffNode) this.ast).left instanceof Nil) {
                    type_left = "void";
                } else {
                    type_left = getType(((DiffNode) this.ast).left);
                }
                if (((DiffNode) this.ast).right instanceof Nil) {
                    type_right = "void";
                } else {
                    type_right = getType(((DiffNode) this.ast).right);
                }

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("int") || !type_right.equals("String")
                            || !type_left.equals("int") || !type_left.equals("String")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "DiffNode must have two operands of the same type");
                        }
                    }
                }
            }
            if (((DiffNode) this.ast).left instanceof Lvalue
                    && !(((DiffNode) this.ast).right instanceof IntNode)
                    && !(((DiffNode) this.ast).right instanceof Lvalue)) {
                String type_left = getType(((DiffNode) this.ast).left);
                if (type_left != null) {
                    nb_error++;
                    System.out.println("Error at line " + this.ligne + " : "
                            + "DiffNode must have two operands of the same type");

                }
            }

        }

        if (this.ast instanceof AndNode) {
            if (((AndNode) this.ast).left instanceof Nil
                    || ((AndNode) this.ast).right instanceof Nil) {
                System.out.println(
                        "Error at line " + this.ligne + " : Unauthorized operator for \"nil\"");
                nb_error++;
            }
            if (((AndNode) this.ast).left instanceof Lvalue
                    && ((AndNode) this.ast).right instanceof Lvalue) {
                String type_left = getType(((AndNode) this.ast).left);
                String type_right = getType(((AndNode) this.ast).right);

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("boolean") || !type_left.equals("boolean")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "AndNode must have two operands of the same type");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof OrNode) {
            if (((OrNode) this.ast).left instanceof Nil
                    || ((OrNode) this.ast).right instanceof Nil) {
                System.out.println(
                        "Error at line " + this.ligne + " : Unauthorized operator for \"nil\"");
                nb_error++;
            }
            if (((OrNode) this.ast).left instanceof Lvalue
                    && ((OrNode) this.ast).right instanceof Lvalue) {
                String type_left = getType(((OrNode) this.ast).left);
                String type_right = getType(((OrNode) this.ast).right);

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("boolean") || !type_left.equals("boolean")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "OrNode must have two operands of the same type");
                        }
                    }
                }
            }
        }

        if (this.ast instanceof Plus) {
            if (((Plus) this.ast).left instanceof Nil || ((Plus) this.ast).right instanceof Nil) {
                System.out.println(
                        "Error at line " + this.ligne + " : Unauthorized operator for \"nil\"");
                nb_error++;
            }
            if (((Plus) this.ast).left instanceof Lvalue
                    && ((Plus) this.ast).right instanceof Lvalue) {
                String type_left = getType(((Plus) this.ast).left);
                String type_right = getType(((Plus) this.ast).right);

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("int") || !type_right.equals("String")
                            || !type_left.equals("int") || !type_left.equals("String")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "Plus must have two operands of the same type");
                        }
                    }
                }
            }
            if (((Plus) this.ast).left instanceof Lvalue
                    && !(((Plus) this.ast).right instanceof IntNode)
                    && !(((Plus) this.ast).right instanceof Lvalue)) {
                String type_left = getType(((Plus) this.ast).left);
                if (type_left != null) {
                    nb_error++;
                    System.out.println("Error at line " + this.ligne + " : "
                            + "Plus must have two operands of the same type");

                }
            }
        }

        if (this.ast instanceof Minus) {
            if (((Minus) this.ast).left instanceof Nil || ((Minus) this.ast).right instanceof Nil) {
                System.out.println(
                        "Error at line " + this.ligne + " : Unauthorized operator for \"nil\"");
                nb_error++;
            }
            if (((Minus) this.ast).left instanceof Lvalue
                    && ((Minus) this.ast).right instanceof Lvalue) {
                String type_left = getType(((Minus) this.ast).left);
                String type_right = getType(((Minus) this.ast).right);

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("int") || !type_right.equals("String")
                            || !type_left.equals("int") || !type_left.equals("String")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "Minus must have two operands of the same type");
                        }
                    }
                }
            }
            if (((Minus) this.ast).left instanceof Lvalue
                    && !(((Minus) this.ast).right instanceof IntNode)
                    && !(((Minus) this.ast).right instanceof Lvalue)) {
                String type_left = getType(((Minus) this.ast).left);
                if (type_left != null) {
                    nb_error++;
                    System.out.println("Error at line " + this.ligne + " : "
                            + "Minus must have two operands of the same type");

                }
            }
        }

        if (this.ast instanceof Mult) {
            if (((Mult) this.ast).left instanceof Nil || ((Mult) this.ast).right instanceof Nil) {
                System.out.println(
                        "Error at line " + this.ligne + " : Unauthorized operator for \"nil\"");
                nb_error++;
            }
            if (((Mult) this.ast).left instanceof Lvalue
                    && ((Mult) this.ast).right instanceof Lvalue) {
                String type_left = getType(((Mult) this.ast).left);
                String type_right = getType(((Mult) this.ast).right);

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("int") || !type_right.equals("String")
                            || !type_left.equals("int") || !type_left.equals("String")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "Mult must have two operands of the same type");
                        }
                    }
                }
            }
            if (((Mult) this.ast).left instanceof Lvalue
                    && !(((Mult) this.ast).right instanceof IntNode)
                    && !(((Mult) this.ast).right instanceof Lvalue)) {
                String type_left = getType(((Mult) this.ast).left);
                if (type_left != null) {
                    nb_error++;
                    System.out.println("Error at line " + this.ligne + " : "
                            + "Mult must have two operands of the same type");

                }
            }
        }

        if (this.ast instanceof Div) {
            if (((Div) this.ast).left instanceof Nil || ((Div) this.ast).right instanceof Nil) {
                System.out.println(
                        "Error at line " + this.ligne + " : Unauthorized operator for \"nil\"");
                nb_error++;
            }
            if (((Div) this.ast).left instanceof Lvalue
                    && ((Div) this.ast).right instanceof Lvalue) {
                String type_left = getType(((Div) this.ast).left);
                String type_right = getType(((Div) this.ast).right);

                if (type_right != null && type_left != null) {
                    if (!type_right.equals("int") || !type_right.equals("String")
                            || !type_left.equals("int") || !type_left.equals("String")) {
                        if (!type_right.equals(type_left)) {
                            nb_error++;
                            System.out.println("Error at line " + this.ligne + " : "
                                    + "Div must have two operands of the same type");
                        }
                    }
                }
            }
            if (((Div) this.ast).left instanceof Lvalue
                    && !(((Div) this.ast).right instanceof IntNode)
                    && !(((Div) this.ast).right instanceof Lvalue)) {
                String type_left = getType(((Div) this.ast).left);
                if (type_left != null) {
                    nb_error++;
                    System.out.println("Error at line " + this.ligne + " : "
                            + "Div must have two operands of the same type");

                }
            }
        }
        return nb_error;
    }
}
