package unogame;

public class CardDraw {
    public enum Draw {DRAW_CARD1, DRAW_CARD2,  DRAW_CARD3, DRAW_CARD4};
    private final Draw draw;
    public CardDraw(Draw c)
    {
        draw=c;
    }
    public Draw getDraw() {
        return this.draw;
    }
}
