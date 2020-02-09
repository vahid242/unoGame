package unogame;

public class CardHand {
    private int handSize = 52;
    public Card[] cards = new Card[handSize];
    private int handSize2 = 48;
    public Card2[] cards2 = new Card2[handSize2];
    private int handSizeWild = 4;
    public CardWild[] cardsWild = new CardWild[handSizeWild];
    private int handSizeDraw = 4;
    public CardDraw[] cardsDraw = new CardDraw[handSizeDraw];

    public void generateHand()
    {
        int countCards = 0;
        for(Card.Color c: Card.Color.values())
        {
            for(Card.Value1 v: Card.Value1.values())
            {
                cards[countCards] = (new Card(c,v));
                countCards++;
            }
        }
    }
    public void generateHand2()
    {
        int countCards = 0;
        for(Card2.Color c: Card2.Color.values())
        {
            for(Card2.Value v: Card2.Value.values())
            {
                cards2[countCards] = (new Card2(c,v));
                countCards++;
            }
        }
    }
    public void generateHandWild()
    {
        int countCards = 0;
        for(CardWild.Wild c: CardWild.Wild.values())
        {
                cardsWild[countCards] = (new CardWild(c));
                countCards++;
        }
    }
    public void generateHandDraw()
    {
        int countCards = 0;
        for(CardDraw.Draw c: CardDraw.Draw.values())
        {
            cardsDraw[countCards] = (new CardDraw(c));
            countCards++;
        }
    }
}

