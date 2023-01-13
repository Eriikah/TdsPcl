package tds;

public abstract class Symbol {

    private String name;
    private int depl;

    public Symbol(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String value) {
    }

    public void setDepl(int depl) {
        this.depl = depl;
    }
}
