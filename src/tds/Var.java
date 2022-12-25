package tds;

public class Var extends Symbol {

    private String type;
    private int depl;

    public Var(String name, String type, int depl) {
        super(name);
        this.type = type;
        this.depl = depl;
    }

    public String getType() {
        return this.type;
    }

    public int getDepl() {
        return this.depl;
    }
}
