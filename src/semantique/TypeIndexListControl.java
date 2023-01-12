package semantique;

import ast.*;
import tds.*;

import java.util.ArrayList;

public class TypeIndexListControl extends Control{

    public TypeIndexListControl(Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        super(ast, tds, tdsList);
    }
    
    @Override
    public int control() {
        int nb_error = 0;
        
        if (this.ast instanceof ListDecl){
            if (((ListDecl) this.ast).list instanceof StringNode){
                System.out.println("Error: List index must be an integer");
                nb_error++;
            }
        }

        return nb_error;
    }

}
