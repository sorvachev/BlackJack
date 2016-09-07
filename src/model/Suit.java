package model;

/**
 * Created by sakic on 9/7/16.
 */
public enum Suit {
    Diamonds("♢"), Hearts("♡"), Clubs("♣"), Spades("♠");

    private String name;

    Suit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}