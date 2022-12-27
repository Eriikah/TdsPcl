package tds;

public class Type extends Symbol {

    private String type;
    private int depl;

    public Type(String name, String type, int depl) {
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

    public void setDepl(int depl) {
        this.depl = depl;
    }
}
