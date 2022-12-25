package tds;

import java.util.ArrayList;

public class Tds {

    private int imbric;
    private ArrayList<Symbol> symbols;

    public Tds(int imbric, ArrayList<Symbol> symbols) {
        this.imbric = imbric;
        this.symbols = symbols;
    }

    public void addSymbol(Symbol symbol) {
        this.symbols.add(symbol);
    }

    public int getImbric() {
        return imbric;
    }

    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }
}
