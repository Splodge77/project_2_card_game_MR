package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 25/01/2018.
 */

public class GameTest {

    Game game;
    Card card1;
    Card card2;


    @Before
    public void before(){
        game = new Game(0);
    }

    @Test
    public void handHasValue(){
        card1 = new Card(CardName.KING, Suit.DIAMONDS, 10);
        card2 = new Card(CardName.SEVEN, Suit.SPADES, 7);
        game.hand.add(card1);
        game.hand.add(card2);
        assertEquals(17, game.getScore());
    }
}
