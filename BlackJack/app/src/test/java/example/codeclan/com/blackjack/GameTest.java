package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 25/01/2018.
 */

public class GameTest {

    Game game;
    Player player;


    @Before
    public void before(){
        game = new Game();
        player = new Player();
    }

    @Test
    public void playerHasOneCardAtStart(){
        game.deal();
        assertEquals(1, player.handSize());
    }

}
