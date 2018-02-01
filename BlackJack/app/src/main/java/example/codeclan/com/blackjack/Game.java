package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

public class Game {

    Deck deck;
    public ArrayList<Card> dealerHand;
    public ArrayList<Card> hand;
    private Integer score;

    public Game(Integer score){
        this.dealerHand = new ArrayList<>();
        this.hand = new ArrayList<>();
        this.score = score;
    }

    public int getScore() {
        for(int i = 0; i < hand.size(); i++) {
            Card cards = hand.get(i);
            score = cards.getCardValue();
        }
        return score;
    }

    public void hit() {
        if (getScore() < 21){
            Card card = deck.randomCard();
            hand.add(card);
        }
        if (getScore() > 21 && hand.contains(CardName.ACE)){
            Card card = hand.get(0);
            card.setCardValue(1);
        }
        return;
    }

}
