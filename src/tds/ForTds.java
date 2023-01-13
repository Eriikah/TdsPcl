package tds;

public class ForTds extends Symbol {

    private String iterableId;

    public ForTds(String iterableId) {
        super("For " + iterableId);
        this.iterableId = iterableId;

    }

    public String getIterableId() {
        return iterableId;
    }
}
