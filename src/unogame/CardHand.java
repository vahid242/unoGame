package unogame;

/**
 *a class that models the Card Hand.
 * @author Vahid Ghaedsharaf
 */
public class CardHand {
    private int handSize = 56;
    public Card[] cards = new Card[handSize];
    
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
        
}

