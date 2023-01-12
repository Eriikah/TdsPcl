package semantique;

import ast.*;
import tds.*;

import java.util.ArrayList;

public class TypeOfExprListControl extends Control{
    
    public TypeOfExprListControl(Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        super(ast, tds, tdsList);
    }
    
    @Override
    public int control() {
        int nb_error = 0;
        
        if (this.ast instanceof ListDecl){
            String type = ((TypeId)((ListDecl) this.ast).typeId).getValue();

            if (type.equals("intArray")){
                if (!(((ListDecl) this.ast).ofexpr instanceof IntNode)){
                    System.out.println("Error: List must contain integers");
                    nb_error++;
                }
            }

            if (type.equals("StringArray")){
                if (!(((ListDecl) this.ast).ofexpr instanceof StringNode)){
                    System.out.println("Error: List must contain strings");
                    nb_error++;
                }
            }
            
        }

        return nb_error;
    }

}
