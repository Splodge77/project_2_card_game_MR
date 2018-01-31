package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 25/01/2018.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("bob");
    }

}
