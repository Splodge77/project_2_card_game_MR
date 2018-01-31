package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

public class Game {

    Deck deck;
    public ArrayList<Card> dealerHand;
    public ArrayList<Card> hand;

    public void Game(){
        this.dealerHand = new ArrayList<>();
        this.hand = new ArrayList<>();
    }

    public int score(int value) {
        for(int i = 0; i < hand.size(); i++) {
            Card cards = hand.get(i);
            value = cards.getCardValue();
        }
        return value;
    }

    public void hit() {
        if (score(0) < 21){
            Card card = deck.randomCard();
            hand.add(card);
        }
        if (score(0) > 21 && hand.contains(CardName.ACE)){
            Card card = hand.get(0);
            card.setCardValue(1);
        }
        else
        return;
    }

}
