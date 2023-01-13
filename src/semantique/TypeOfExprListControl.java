package semantique;

import ast.*;
import tds.*;

import java.util.ArrayList;

public class TypeOfExprListControl extends Control{

    private int ligne;
    
    public TypeOfExprListControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
    }
    
    @Override
    public int control() {
        int nb_error = 0;
        
        if (this.ast instanceof ListDecl){
            String type = ((TypeId)((ListDecl) this.ast).typeId).getValue();

            if (type.equals("intArray")){
                if (!(((ListDecl) this.ast).ofexpr instanceof IntNode)){
                    System.out.println("Error: List must contain integers at line "+this.ligne);
                    nb_error++;
                }
            }

            if (type.equals("StringArray")){
                if (!(((ListDecl) this.ast).ofexpr instanceof StringNode)){
                    System.out.println("Error: List must contain strings at line "+this.ligne);
                    nb_error++;
                }
            }
            
        }

        return nb_error;
    }

}
