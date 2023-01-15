package semantique;

import java.util.ArrayList;

import ast.Ast;
import tds.Tds;
import ast.Div;
import ast.IntNode;

public class DivisionByZeroControl extends Control {

    private int ligne;

    public DivisionByZeroControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }

    @Override
    public int control() {
        int nb_error = 0;

        Div division = (Div) this.ast;
        if (division.right instanceof IntNode)
            if (((IntNode) division.right).getValue().equals("0")) {
                System.out.println("Error at line " + this.ligne + " : " + "Division by 0");
                nb_error++;
            }

        return nb_error;

    }
}
