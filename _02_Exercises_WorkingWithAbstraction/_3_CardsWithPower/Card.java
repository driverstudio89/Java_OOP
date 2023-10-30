package _02_Exercises_WorkingWithAbstraction._3_CardsWithPower;

public class Card {
    private RankPower rank;
    private SuitPower suit;

    public Card(RankPower rank, SuitPower suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int calculateCardPower() {
        return this.suit.getSuitPower() + this.rank.getRankPower();
    }

}
