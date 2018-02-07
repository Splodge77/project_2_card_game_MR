package example.codeclan.com.blackjack;


/**
 * Created by user on 25/01/2018.
 */

public class Card {

    private CardName cardName;
    private Suit suit;

    public Card(CardName cardName, Suit suit, int value){
        this.cardName = cardName;
        this.suit = suit;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public CardName getCardName(){
        return this.cardName;
    }

    public int getCardValue(){
        return this.cardName.getValue();
    }

//    public int setCardValue(int newValue){
//        return this.cardValue = newValue;
//    }
}
