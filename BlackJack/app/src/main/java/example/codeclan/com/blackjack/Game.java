package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

public class Game {

    Deck deck;
    public ArrayList<Card> dealerHand;
    Hand hand;

    public Game(){
        this.dealerHand = new ArrayList<>();

    }

    public void deal(){
        Card card = deck.randomCard();
        if (hand.handSize() < 1) {
            hand.addCard(card);
        }
        if (dealerHand.size() < 2) {
            dealerHand.add(card);
        }
        hand.getScore();
    }

}
