package _02_Exercises_WorkingWithAbstraction._3_CardsWithPower;

public enum SuitPower {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int suitPower;

    SuitPower(int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return this.suitPower;
    }
}
