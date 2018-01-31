package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

public class Game {

//    Player player;
    Deck deck;
    public ArrayList<Card> dealerHand;
    public ArrayList<Card> hand;

    public void Game(){
//        this.player = new Player("bob");
        this.dealerHand = new ArrayList<>();
        this.hand = new ArrayList<>();
    }

    public int score() {
        Card card1 = hand.get(0);
        Card card2 = hand.get(1);
        return card1.getCardValue() + card2.getCardValue();
    }

    public void hit() {
        if (score() < 21){
            Card card = deck.randomCard();
            hand.add(card);
        }
        if (score() > 21 && hand.contains(CardName.ACE)){
            score() -= 10;
        }
        else
        return;
    }

}
