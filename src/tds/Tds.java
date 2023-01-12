package tds;

import java.util.ArrayList;

public class Tds {

    private int imbric;
    private ArrayList<Symbol> symbols;

    private Tds parent;
    private ArrayList<Tds> enfants;
    private String name;
    private int bloc;

    public Tds(int imbric, ArrayList<Symbol> symbols, int bloc) {
        this.imbric = imbric;
        this.symbols = symbols;

        this.parent = null;
        this.enfants = new ArrayList<>();
        // this.name = name;
        this.bloc = bloc;
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

    public ArrayList<Tds> getEnfants() {
        return enfants;
    }

    public void addEnfant(Tds enfant) {
        this.enfants.add(enfant);
    }

    public Tds getParent() {
        return parent;
    }

    public void setParent(Tds parent) {
        this.parent = parent;
        this.parent.addEnfant(this);
    }

    public String getName() {
        return name;
    }

    public int getBloc() {
        return bloc;
    }

    @Override
    public String toString() {
        StringBuilder table = new StringBuilder();
        Tds pere = this.getParent();
        if (pere != null) {
            table.append(String.format("\u001b[31m_ %s - Imbrication : %s - Bloc : %s - Parent : %s _\n\u001b[0m",
                    this.getName(), this.getImbric(), this.getBloc(), pere.getBloc()));
        } else {
            table.append(String.format("\u001b[31m_ %s - Imbrication : %s - Bloc : %s - Parent : null _\n\u001b[0m",
                    this.getName(), this.getImbric(), this.getBloc()));
        }
        for (Symbol symbol : this.getSymbols()) {
            if (symbol instanceof Param) {
                Param param = (Param) symbol;
                String ligne = String.format(
                        "\u001b[38;5;214m Paramètre : %s | Type : %s | Déplacement : %d\u001B[0m",
                        param.getName(), param.getType(), param.getDepl());
                table.append(ligne).append("\n");
            } else if (symbol instanceof Function) {
                Function function = (Function) symbol;
                String ligne = String.format(
                        "\u001B[35m Fonction : %s | Type de retour : %s | Déplacement : %d |/ ",
                        function.getName(), function.getReturnType(), function.getParams().size());
                if (function.getParams() != null) {
                    for (Param param : function.getParams()) {
                        ligne += String.format("Paramètre : %s | Type : %s | Déplacement : %d\u001B[0m",
                                param.getName(), param.getType(), param.getDepl());
                    }
                } else {
                    ligne += "Pas de paramètres\u001B[0m";
                }

                table.append(ligne).append("\n");
            } else if (symbol instanceof Var) {
                Var var = (Var) symbol;
                String ligne = String.format("\u001B[33mVariable : %s | Type : %s | Déplacement : %d\u001B[0m",
                        var.getName(), var.getType(), var.getDepl());
                table.append(ligne).append("\n");
            } else if (symbol instanceof Type) {
                Type type = (Type) symbol;
                String ligne = String.format("\u001B[37m Type : %s | Type : %s | Déplacement : %d\u001B[0m",
                        type.getName(), type.getType(), type.getDepl());
                table.append(ligne).append("\n");
            } else if (symbol instanceof ForTds) {
                ForTds forTds = (ForTds) symbol;
                String ligne = String.format("\u001B[36m %s | for %s in range %d %d  | Déplacement :\u001B[0m",
                        forTds.getName(), forTds.getIterableId(), forTds.getStartValue(), forTds.getEndValue());
                table.append(ligne).append("\n");
            } else if (symbol instanceof Record) {
                Record record = (Record) symbol;
                String ligne = String.format("\u001B[37m Type : %s | { ",
                        record.getName());
                for (Var var : record.getContent()) {
                    ligne = ligne + var.getName() + ":" + var.getType() + " ";
                }
                table.append(ligne).append("}\n");
            }
        }
        table.append("\u001b[31m_---END---\u001B[0m\n");
        return table.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol(String name) {
        for (Symbol symbol : this.getSymbols()) {
            if (symbol.getName().equals(name)) {
                return symbol;
            }
        }
        return null;
    }

}
