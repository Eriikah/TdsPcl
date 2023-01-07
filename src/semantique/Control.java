package semantique;

import java.util.ArrayList;
import tds.*;
import ast.*;

public class Control {
    protected Tds tds;
    protected Ast ast;
    protected ArrayList<Tds> tdsList;

    public Control(Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        this.ast = ast;
        this.tds = tds;
        this.tdsList = tdsList;
    }

    public int control() {
        return 0;
    }

    public String getType(String name){
        Tds tds_current = this.tds;

        if (tds_current == null) {
            System.out.println("Tds null");
            return null;
        }

        Symbol symbol = tds_current.getSymbol(name);

        while (symbol == null) {
            tds_current = tds_current.getParent();
            if (tds_current == null) {
                System.out.println("Symbol null");
                return null;
            }
            symbol = tds_current.getSymbol(name);
        }

        if (symbol instanceof Function){
            return ((Function) symbol).getReturnType();
        } 
        else if (symbol instanceof Var){
            return ((Var) symbol).getType();
        } 
        else if (symbol instanceof Param){
            return ((Param) symbol).getType();
        } 
        else {
            return null;
        }
    }

    public Tds getTds(String name) {
        for (Tds tds : this.tdsList) {
            if (tds.getName().equals(name)) {
                return tds;
            }
        }
        return null;
    }

    /*public String getType(Ast ast){
        //todo
    }*/
}
