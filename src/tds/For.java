package tds;

public class For extends Symbol {

    private String iterableId;
    private int startValue;
    private int endValue;

    public For(String iterableId, int startValue, int endValue) {
        super("For" + iterableId);
        this.iterableId = iterableId;
        this.startValue = startValue;
        this.endValue = startValue;
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
