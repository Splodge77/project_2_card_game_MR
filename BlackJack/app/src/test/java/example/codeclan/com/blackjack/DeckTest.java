package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 25/01/2018.
 */

public class DeckTest {

    @Test
    public void getList(){
        Deck deck = new Deck();
        assertEquals(52, deck.getList().size);
    }
}
