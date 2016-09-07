package model;

import java.util.*;

/**
 * Created by sakic on 9/7/16.
 */
public class Deck {
    private Stack<Card> deck;
    List<Card> cards;



    static Random random = new Random(System.currentTimeMillis());

    Deck() {
        this.deck = shuffleDeck(generateDeck());
    }

    private Stack<Card> shuffleDeck(List<Card> deck) {
        Stack<Card> newDeck = new Stack<Card>();
        Collections.shuffle(deck, random);
        newDeck.addAll(deck);
        return newDeck;
    }

    private List<Card> generateDeck() {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }

    public Card getNewCard() {
        return deck.pop();
    }
}