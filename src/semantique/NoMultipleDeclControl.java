package semantique;

import java.util.ArrayList;

import ast.Ast;
import tds.Symbol;
import tds.Tds;

public class NoMultipleDeclControl extends Control {

    public NoMultipleDeclControl(Ast ast, Tds tds, ArrayList<Tds> tdsList) {
        super(ast, tds, tdsList);
    }

    @Override
    public int control() {
        int error = 0;
        if (ast != null) {
            ArrayList<Symbol> symbols = tds.getSymbols();
            for (int i = 0; i < symbols.size(); i++) {
                for (int j = i; j < symbols.size(); j++) {
                    if (j != i) {
                        if (symbols.get(i).getName().equals(symbols.get(j).getName())) {
                            System.err.println("DeclarationError : " +
                                    String.format("'%s' is already defined", symbols.get(j).getName()));
                            error += 1;
                        }
                    }
                }
            }
        }
        return error;
    }
}
