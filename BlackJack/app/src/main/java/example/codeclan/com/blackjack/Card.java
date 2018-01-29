package example.codeclan.com.blackjack;


/**
 * Created by user on 25/01/2018.
 */

public class Card {

    private CardName cardName;
    private Suit suit;
    int cardValue;

    public Card(CardName cardName, Suit suit, int cardValue){
        this.cardName = cardName;
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public CardName getCardName(){
        return this.cardName;
    }

    public int getCardValue(){
        return this.cardValue;
    }
}
