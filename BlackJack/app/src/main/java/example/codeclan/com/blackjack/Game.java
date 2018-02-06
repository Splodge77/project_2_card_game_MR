package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

public class Game {

    Deck deck;
    public ArrayList<Card> dealerHand;
    private Integer score;

    public Game(Integer score){
        this.dealerHand = new ArrayList<>();
        this.score = score;
    }

}
