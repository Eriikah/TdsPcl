package semantique;

import ast.*;
import tds.*;

import java.util.ArrayList;

public class BinOpTypeControl extends Control{
    
    public BinOpTypeControl( Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        super(ast, tds, tdsList);
    }

    @Override
    public int control() {
        int nb_error = 0;
        if (this.ast instanceof SupNode){
            String type_left = getType(((SupNode) this.ast).left);
            String type_right = getType(((SupNode) this.ast).right);
            
            if (type_right != null && type_left != null){
                if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                    if (!type_right.equals(type_left)){
                        System.out.println("Error: SupNode must have two operands of the same type");
                    }
                }
            }
        }

        if (this.ast instanceof InfNode){
            String type_left = getType(((InfNode) this.ast).left);
            String type_right = getType(((InfNode) this.ast).right);
            
            if (type_right != null && type_left != null){
                if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                    if (!type_right.equals(type_left)){
                        System.out.println("Error: InfNode must have two operands of the same type");
                    }
                }
            }

        }

        if (this.ast instanceof SupEqNode){
            String type_left = getType(((SupEqNode) this.ast).left);
            String type_right = getType(((SupEqNode) this.ast).right);
            
            if (type_right != null && type_left != null){
                if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                    if (!type_right.equals(type_left)){
                        System.out.println("Error: SupEqNode must have two operands of the same type");
                    }
                }
            }
        }

        if (this.ast instanceof InfEqNode){
            String type_left = getType(((InfEqNode) this.ast).left);
            String type_right = getType(((InfEqNode) this.ast).right);
            
            if (type_right != null && type_left != null){
                if (!type_right.equals("int") || !type_right.equals("String") || !type_left.equals("int") || !type_left.equals("String")){
                    if (!type_right.equals(type_left)){
                        System.out.println("Error: InfEqNode must have two operands of the same type");
                    }
                }
            }
        }

        if (this.ast instanceof EqNode){
            String type_left = getType(((EqNode) this.ast).left);
            if (type_left != null){
                if (!type_left.equals("int")){
                    nb_error++;
                }
            }
            String type_right = getType(((EqNode) this.ast).right);
            if (type_right != null){
                if (!type_right.equals("int")){
                    nb_error++;
                }
            }

            if (nb_error == 2){
                System.out.println("Error: EqNode must have two int operands");
                nb_error++;
            }
            if (nb_error == 1){
                if (type_left != "int"){
                    System.out.println("Error: left operand of EqNode must be int");
                    nb_error++;
                }
                if (type_right != "int"){
                    System.out.println("Error: right operand of EqNode must be int");
                    nb_error++;
                }
            }
        }

        if (this.ast instanceof DiffNode){
            String type_left = getType(((DiffNode) this.ast).left);
            if (type_left != null){
                if (!type_left.equals("int")){
                    nb_error++;
                }
            }
            String type_right = getType(((DiffNode) this.ast).right);
            if (type_right != null){
                if (!type_right.equals("int")){
                    nb_error++;
                }
            }

            if (nb_error == 2){
                System.out.println("Error: DiffNode must have two int operands");
                nb_error++;
            }
            if (nb_error == 1){
                if (type_left != "int"){
                    System.out.println("Error: left operand of DiffNode must be int");
                    nb_error++;
                }
                if (type_right != "int"){
                    System.out.println("Error: right operand of DiffNode must be int");
                    nb_error++;
                }
            }
        }

        if (this.ast instanceof AndNode){
            String type_left = getType(((AndNode) this.ast).left);
            if (type_left != null){
                if (!type_left.equals("boolean")){
                    nb_error++;
                }
            }
            String type_right = getType(((AndNode) this.ast).right);
            if (type_right != null){
                if (!type_right.equals("boolean")){
                    nb_error++;
                }
            }

            if (nb_error == 2){
                System.out.println("Error: AndNode must have two boolean operands");
                nb_error++;
            }
            if (nb_error == 1){
                if (type_left != "boolean"){
                    System.out.println("Error: left operand of AndNode must be boolean");
                    nb_error++;
                }
                if (type_right != "boolean"){
                    System.out.println("Error: right operand of AndNode must be boolean");
                    nb_error++;
                }
            }
        }

        if (this.ast instanceof OrNode){
            String type_left = getType(((OrNode) this.ast).left);
            if (type_left != null){
                if (!type_left.equals("boolean")){
                    nb_error++;
                }
            }
            String type_right = getType(((OrNode) this.ast).right);
            if (type_right != null){
                if (!type_right.equals("boolean")){
                    nb_error++;
                }
            }

            if (nb_error == 2){
                System.out.println("Error: OrNode must have two boolean operands");
                nb_error++;
            }
            if (nb_error == 1){
                if (type_left != "boolean"){
                    System.out.println("Error: left operand of OrNode must be boolean");
                    nb_error++;
                }
                if (type_right != "boolean"){
                    System.out.println("Error: right operand of OrNode must be boolean");
                    nb_error++;
                }
            }
        }

        if (this.ast instanceof Plus){
            String type_left = getType(((Plus) this.ast).left);
            if (type_left != null){
                if (!type_left.equals("int")){
                    nb_error++;
                }
            }
            String type_right = getType(((Plus) this.ast).right);
            if (type_right != null){
                if (!type_right.equals("int")){
                    nb_error++;
                }
            }

            if (nb_error == 2){
                System.out.println("Error: Plus must have two int operands");
                nb_error++;
            }
            if (nb_error == 1){
                if (type_left != "int"){
                    System.out.println("Error: left operand of Plus must be int");
                    nb_error++;
                }
                if (type_right != "int"){
                    System.out.println("Error: right operand of Plus must be int");
                    nb_error++;
                }
            }
        }

        if (this.ast instanceof Minus){
            String type_left = getType(((Minus) this.ast).left);
            if (type_left != null){
                if (!type_left.equals("int")){
                    nb_error++;
                }
            }
            String type_right = getType(((Minus) this.ast).right);
            if (type_right != null){
                if (!type_right.equals("int")){
                    nb_error++;
                }
            }

            if (nb_error == 2){
                System.out.println("Error: Minus must have two int operands");
                nb_error++;
            }
            if (nb_error == 1){
                if (type_left != "int"){
                    System.out.println("Error: left operand of Minus must be int");
                    nb_error++;
                }
                if (type_right != "int"){
                    System.out.println("Error: right operand of Minus must be int");
                    nb_error++;
                }
            }
        }

        if (this.ast instanceof Mult){
            String type_left = getType(((Mult) this.ast).left);
            if (type_left != null){
                if (!type_left.equals("int")){
                    nb_error++;
                }
            }
            String type_right = getType(((Mult) this.ast).right);
            if (type_right != null){
                if (!type_right.equals("int")){
                    nb_error++;
                }
            }

            if (nb_error == 2){
                System.out.println("Error: Mult must have two int operands");
                nb_error++;
            }
            if (nb_error == 1){
                if (type_left != "int"){
                    System.out.println("Error: left operand of Mult must be int");
                    nb_error++;
                }
                if (type_right != "int"){
                    System.out.println("Error: right operand of Mult must be int");
                    nb_error++;
                }
            }
        }

        if (this.ast instanceof Div){
            String type_left = getType(((Div) this.ast).left);
            if (type_left != null){
                if (!type_left.equals("int")){
                    nb_error++;
                }
            }
            String type_right = getType(((Div) this.ast).right);
            if (type_right != null){
                if (!type_right.equals("int")){
                    nb_error++;
                }
            }

            if (nb_error == 2){
                System.out.println("Error: Div must have two int operands");
                nb_error++;
            }
            if (nb_error == 1){
                if (type_left != "int"){
                    System.out.println("Error: left operand of Div must be int");
                    nb_error++;
                }
                if (type_right != "int"){
                    System.out.println("Error: right operand of Div must be int");
                    nb_error++;
                }
            }
        }

        return nb_error;
    }
}
