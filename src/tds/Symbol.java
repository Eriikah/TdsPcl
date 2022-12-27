package tds;

public abstract class Symbol {

    private String name;

    public Symbol(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String value) {
    }
}
