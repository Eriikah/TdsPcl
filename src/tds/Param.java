package tds;

public class Param extends Symbol {

    private String type;
    private int depl;

    public Param(String name, String type, int depl) {
        super(name);
        this.type = type;
        this.depl = depl;
    }

    public String getType() {
        return type;
    }

    public int getDepl() {
        return depl;
    }
}
