package unogame;

public class Card2 {
public enum Color {RED, ORANGE, GREEN, BLUE};
    public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SkIP, REVERSE, DRAW_TWO};
    private final Color color;
    private final Value value;
    public Card2(Color c, Value gVal)
    {
        color = c;
        value= gVal;
    }

    public Value getValue() {
        return this.value;
    }

    public Color getColor() {
        return this.color;
    }
}
