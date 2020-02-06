package unogame;

public class CardHand2 {
    public class CardHand {
    private int handSize = 52;
    public Card2[] cards1 = new Card2[handSize];
    
    public void generateHand1()
        {
                int countCards = 0;
		for(Card2.Color c: Card2.Color.values())
                {
                    for(Card2.Value1 v: Card2.Value1.values())
                    { 
                        cards1[countCards] = (new Card2(c,v));
                        countCards++;
                    }
                }   
        }
        
}

}
