package example.codeclan.com.blackjack;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 06/02/2018.
 */

public class HandTest {

    Hand hand;
    Card card;
    Card card1;
    Card card2;

    @Before
    public void before(){
        hand = new Hand();
    }

    @Test
    public void cardAdded(){
        card = new Card(CardName.JACK, Suit.DIAMONDS);
        hand.addCard(card);
        assertNotNull(card);
    }

    @Test
    public void handHasValue(){
        card1 = new Card(CardName.KING, Suit.DIAMONDS);
        card2 = new Card(CardName.SEVEN, Suit.SPADES);
        hand.addCard(card1);
        hand.addCard(card2);
        hand.setScore();
        assertEquals(17, hand.getScore());
    }

    @Test
    public void aceBecomesOne(){
        card1 = new Card(CardName.ACE, Suit.SPADES);
        card2 = new Card(CardName.ACE, Suit.HEARTS);
        hand.addCard(card1);
        hand.addCard(card2);
        hand.setScore();
        assertEquals(12, hand.getScore());
    }

    @Test
    public void playerSticks(){
        hand.stick();
        assertEquals(true, hand.stick);
    }


}
