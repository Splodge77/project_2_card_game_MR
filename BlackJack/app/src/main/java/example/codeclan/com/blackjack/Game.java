package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

public class Game {

    Deck deck;
    public ArrayList<Card> dealerHand;
    Player player;
    private ArrayList<Card> newCards;

    public Game(){
        this.dealerHand = new ArrayList<>();
        this.newCards = new ArrayList<>();
    }

    public void deal() {
        if (player.handSize() < 1 && dealerHand.size() < 2) {
            for (Card card : deck.list) {
                newCards.add(card);
            }
        }
    }
}
