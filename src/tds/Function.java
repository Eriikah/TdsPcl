package tds;

import java.util.ArrayList;

public class Function extends Symbol {

    private ArrayList<Param> params;
    private int paramNumber;
    private String returnType;
    private int depl;

    public Function(String name, ArrayList<Param> params, int paramNumber, String returnType,
            int depl) {
        super(name);
        this.params = params;
        this.paramNumber = paramNumber;
        this.returnType = returnType;
        this.depl = depl;
    }

    public void addParam(Param param) {
        this.params.add(param);
    }

    public ArrayList<Param> getParams() {
        return this.params;
    }

    public int getParamNumber() {
        return this.paramNumber;
    }

    public String getReturnType() {
        return this.returnType;
    }

    public int getDepl() {
        return this.depl;
    }

    public void setType(String value) {
        this.returnType = value;
    }
}
