package tds;

public class ForTds extends Symbol {

    private String iterableId;
    private int startValue;
    private int endValue;

    public ForTds(String iterableId, int startValue, int endValue) {
        super("For" + iterableId);
        this.iterableId = iterableId;
        this.startValue = startValue;
        this.endValue = endValue;
    }

    public String getIterableId() {
        return iterableId;
    }

    public int getStartValue() {
        return startValue;
    }

    public int getEndValue() {
        return endValue;
    }

}
