package edu.euchreproject.gamestate;

public class Card {
    public enum Suit {HEARTS, SPADES, CLUBS, DIAMONDS}
    public String cardname;
    public Card(){

    }

    public String getCardname() {
        return cardname;
    }
}
