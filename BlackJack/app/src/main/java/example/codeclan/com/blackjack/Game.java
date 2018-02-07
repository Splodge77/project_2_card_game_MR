package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

public class Game {


    private ArrayList<Player> players;
    Dealer dealer;


    public Game(ArrayList<Player> players, Dealer dealer){
        this.players = new ArrayList<>();
        this.dealer = dealer;
    }

}
