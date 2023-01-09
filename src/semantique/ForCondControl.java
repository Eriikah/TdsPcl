package semantique;

import java.util.ArrayList;

import ast.*;
import tds.*;

public class ForCondControl extends Control{
    
    public ForCondControl(Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        super(ast, tds, tdsList);
    }

    @Override
    public int control(){
        int nb_error = 0;
        String original = this.getType(((For) this.ast).origExpr.toString());
        String goal = this.getType(((For) this.ast).goalExpr.toString());
        if(original != null && goal != null){
            if(!original.equals(goal)){
                System.out.println("Error: For condition must be of the same type");
                nb_error++;
            }
        }
        return nb_error;
    }

}
