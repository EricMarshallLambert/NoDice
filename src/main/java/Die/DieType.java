package Die;

public enum DieType {

    FOUR(4),
    SIX(6),
    EIGHT(8),
    TEN(10),
    TWENTY(20),
    ONE_HUNDRED(100);
    private int value;
//todo add shape
    DieType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

