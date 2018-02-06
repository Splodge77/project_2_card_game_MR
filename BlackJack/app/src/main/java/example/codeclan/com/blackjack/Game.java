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
        int handLength = hand.size();
        for(int i = 0; i < handLength; i++) {
            Card cards = hand.get(i);
        }
        int newScore = cards.getCardValue();
        setScore(newScore);
        return score;
    }

//    public int getScore() {
//        int handLength = hand.size();
//        for(int i = 0; i < handLength; i++) {
//            Card cards = hand.get(i);
//            int newScore = cards.getCardValue();
//            setScore(newScore);
//        }
//        return score;
//    }

    public void setScore(int newScore){
        this.score = newScore;
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
