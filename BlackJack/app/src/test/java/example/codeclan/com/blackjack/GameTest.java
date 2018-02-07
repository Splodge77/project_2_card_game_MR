package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 25/01/2018.
 */

public class GameTest {

    Game game;
    Hand hand;


    @Before
    public void before(){
        game = new Game();
        hand = new Hand();
    }

}
