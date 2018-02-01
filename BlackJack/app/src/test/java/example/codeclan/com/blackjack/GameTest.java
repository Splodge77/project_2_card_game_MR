package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 25/01/2018.
 */

public class GameTest {

    Game game;
    Card card;


    @Before
    public void before(){
        game = new Game(0);
    }

    @Test
    public void handHasValue(){
        card = new Card(CardName.KING, Suit.DIAMONDS, 10);
        game.hand.add(card);
        assertEquals(10, game.getScore());
    }
}
