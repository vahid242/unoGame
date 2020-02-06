package unogame;

/**
 *A class to handle the user interaction for the Uno game
 * project. Contains a main method that generates a card hand
 * and then iterates over it to print its contents to the console
 * @author Vahid Ghaedsharaf
 */
public class UnoGame 
{
    public static void main(String[] args) 
    {
		CardHand ch = new CardHand();
                ch.generateHand();
                for(Card c: ch.cards)
                {
                    System.out.println(c.getValue1() + " of " + c.getColor());
                }
                CardHand ch1 = new CardHand();
                ch1.generateHand();
                for(Card c: ch1.cards)
                {
                    System.out.println(c.getValue1() + " of " + c.getColor());
                }
                
	}
}
