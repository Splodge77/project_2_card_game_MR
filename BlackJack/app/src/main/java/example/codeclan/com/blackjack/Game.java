package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

public class Game {

    Deck deck;
    public ArrayList<Card> dealerHand;
    Player player;
//    private ArrayList<Card> newCards;

    public Game(){
        this.dealerHand = new ArrayList<>();
//        this.newCards = new ArrayList<>();
    }

    public void deal() {

        do {
            Card newCard = deck.randomCard();
            player.addCard(newCard);
        }
        while (player.handSize() < 1);
        do {
            Card newCard = deck.randomCard();
            dealerHand.add(newCard);
        }
        while (dealerHand.size() < 1);
        do {
            Card newCard = deck.randomCard();
            dealerHand.add(newCard);
        }
        while (player.handSize() < 2);
        do {
            Card newCard = deck.randomCard();
            dealerHand.add(newCard);
        }
        while (dealerHand.size() < 2);

    }
}
