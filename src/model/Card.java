package model;

/**
 * Created by sakic on 9/7/16.
 */
public class Card {
    private  int number;
    private boolean used;
    private Color color;
    public Card(int number, Color color)
    {
        this.number = number;
        this.color = color;

    }
    public int get()
    {
        return number;
    }
    public Color getColor()
    {
        return color;
    }



}
