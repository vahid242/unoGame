package unogame;

public class CardWild {
    public enum Wild {WILD_CARD1, WILD_CARD2,  WILD_CARD3,WILD_CARD4};
    private final Wild wild;
    public CardWild(Wild c)
    {
        wild=c;
    }
    public Wild getWild() {
        return this.wild;
    }
}
