package example.codeclan.com.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

public class Game {


    private ArrayList<Player> players;
    Dealer dealer;


    public Game(Dealer dealer){
        this.players = new ArrayList<>();
        this.dealer = dealer;
    }

    public void start(){
        for (Player player : this.players){
            while (player.handSize() < 2){
                dealer.deal(player);
            }
        }
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
