package semantique;

import java.util.ArrayList;

import ast.Ast;
import tds.Symbol;
import tds.Tds;

public class NoMultipleDeclControl extends Control {

    private int ligne;

    public NoMultipleDeclControl(Ast ast, Tds tds, ArrayList<Tds> tdsList, int ligne) {
        super(ast, tds, tdsList);
        this.ligne = ligne;
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
                                    String.format("'%s' is already defined at line "+this.ligne, symbols.get(j).getName()));
                            error += 1;
                        }
                    }
                }
            }
        }
        return error;
    }
}
