package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 06/02/2018.
 */

public class Hand {

    private ArrayList<Card> hand;
    private int score;

    public Hand(){
        this.hand = new ArrayList<>();
        this.score = score;
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public int handSize(){
        return hand.size();
    }


    public int getScore() {
        return score;
    }

    public int setScore(){
        for(Card card : hand){
            int value = card.getCardValue();
            score += value;
            if(value == 11 && score > 21){
                score += 1;
            }
            else score += value;
        }
        return score;
    }
}
