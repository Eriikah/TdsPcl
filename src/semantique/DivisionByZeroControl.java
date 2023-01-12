package semantique;

import java.util.ArrayList;

import ast.Ast;
import tds.Tds;
import ast.Div;
import ast.Lvalue;

public class DivisionByZeroControl extends Control{
    
    public DivisionByZeroControl(Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        super(ast, tds, tdsList);
    }

    @Override
    public int control() {
        int nb_error = 0;
        
        if (this.ast instanceof Div){
            if (((Div)this.ast).right instanceof Lvalue){
                // if (getType(((Div)this.ast).right).equals("int") && ((Lvalue)((Div)this.ast).right).getLvalueSubs().get(0).equals("0")){
                //     nb_error++;
                //     System.out.println("Error: Division by zero");
                // }
            }
        }

        return nb_error;
    }
}
