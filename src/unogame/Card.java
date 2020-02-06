package unogame;

/**
 *Starter code for the Uno class.
 * @author Vahid Ghaedsharaf
 */
public class Card {
    public enum Color {RED, ORANGE, GREEN, BLUE};
    public enum Value1{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,NINE, SkIP, REVERSE, DRAW_TWO, WILD_DRAW};
    private final Color color;
    private final Value1 value1;
    public Card(Color c, Value1 gVal)
        {
           color = c;
           value1= gVal;
        }
  
	public Value1 getValue1() {
		return this.value1;
	}

    public Color getColor() {
		return this.color;
        }
}

