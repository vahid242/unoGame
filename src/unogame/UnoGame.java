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
        ch.generateHand2();
        for(Card2 c: ch.cards2)
        {
            System.out.println(c.getValue() + " of " + c.getColor());
        }
        ch.generateHandWild();
        for(CardWild c: ch.cardsWild)
        {
            System.out.println(c.getWild());
        }
        ch.generateHandDraw();
        for(CardDraw c: ch.cardsDraw)
        {
            System.out.println(c.getDraw());
        }
    }
}
