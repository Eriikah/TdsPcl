package tds;

import java.util.ArrayList;

public class Record extends Symbol {
    private ArrayList<Var> content = new ArrayList<>();
    private String type;

    public Record(String name, ArrayList<Var> content, String type) {
        super(name);
        this.content = content;
        this.type = type;
    }

    public ArrayList<Var> getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

}
