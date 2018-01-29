package example.codeclan.com.blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 25/01/2018.
 */

public class Deck {
   public ArrayList<Card> list;

   public Deck() {
       list = new ArrayList<Card>();
       list.add(new Card(CardName.ACE, Suit.SPADES, 11));
       list.add(new Card(CardName.KING, Suit.SPADES, 10));
       list.add(new Card(CardName.QUEEN, Suit.SPADES, 10));
       list.add(new Card(CardName.JACK, Suit.SPADES, 10));
       list.add(new Card(CardName.TEN, Suit.SPADES, 10));
       list.add(new Card(CardName.NINE, Suit.SPADES, 9));
       list.add(new Card(CardName.EIGHT, Suit.SPADES, 8));
       list.add(new Card(CardName.SEVEN, Suit.SPADES, 7));
       list.add(new Card(CardName.SIX, Suit.SPADES, 6));
       list.add(new Card(CardName.FIVE, Suit.SPADES, 5));
       list.add(new Card(CardName.FOUR, Suit.SPADES, 4));
       list.add(new Card(CardName.THREE, Suit.SPADES, 3));
       list.add(new Card(CardName.TWO, Suit.SPADES, 2));
       list.add(new Card(CardName.ACE, Suit.HEARTS, 11));
       list.add(new Card(CardName.KING, Suit.HEARTS, 10));
       list.add(new Card(CardName.QUEEN, Suit.HEARTS, 10));
       list.add(new Card(CardName.JACK, Suit.HEARTS, 10));
       list.add(new Card(CardName.TEN, Suit.HEARTS, 10));
       list.add(new Card(CardName.NINE, Suit.HEARTS, 9));
       list.add(new Card(CardName.EIGHT, Suit.HEARTS, 8));
       list.add(new Card(CardName.SEVEN, Suit.HEARTS, 7));
       list.add(new Card(CardName.SIX, Suit.HEARTS, 6));
       list.add(new Card(CardName.FIVE, Suit.HEARTS, 5));
       list.add(new Card(CardName.FOUR, Suit.HEARTS, 4));
       list.add(new Card(CardName.THREE, Suit.HEARTS, 3));
       list.add(new Card(CardName.TWO, Suit.HEARTS, 2));
       list.add(new Card(CardName.ACE, Suit.CLUBS, 11));
       list.add(new Card(CardName.KING, Suit.CLUBS, 10));
       list.add(new Card(CardName.QUEEN, Suit.CLUBS, 10));
       list.add(new Card(CardName.JACK, Suit.CLUBS, 10));
       list.add(new Card(CardName.TEN, Suit.CLUBS, 10));
       list.add(new Card(CardName.NINE, Suit.CLUBS, 9));
       list.add(new Card(CardName.EIGHT, Suit.CLUBS, 8));
       list.add(new Card(CardName.SEVEN, Suit.CLUBS, 7));
       list.add(new Card(CardName.SIX, Suit.CLUBS, 6));
       list.add(new Card(CardName.FIVE, Suit.CLUBS, 5));
       list.add(new Card(CardName.FOUR, Suit.CLUBS, 4));
       list.add(new Card(CardName.THREE, Suit.CLUBS, 3));
       list.add(new Card(CardName.TWO, Suit.CLUBS, 2));
       list.add(new Card(CardName.ACE, Suit.DIAMONDS, 11));
       list.add(new Card(CardName.KING, Suit.DIAMONDS, 10));
       list.add(new Card(CardName.QUEEN, Suit.DIAMONDS, 10));
       list.add(new Card(CardName.JACK, Suit.DIAMONDS, 10));
       list.add(new Card(CardName.TEN, Suit.DIAMONDS, 10));
       list.add(new Card(CardName.NINE, Suit.DIAMONDS, 9));
       list.add(new Card(CardName.EIGHT, Suit.DIAMONDS, 8));
       list.add(new Card(CardName.SEVEN, Suit.DIAMONDS, 7));
       list.add(new Card(CardName.SIX, Suit.DIAMONDS, 6));
       list.add(new Card(CardName.FIVE, Suit.DIAMONDS, 5));
       list.add(new Card(CardName.FOUR, Suit.DIAMONDS, 4));
       list.add(new Card(CardName.THREE, Suit.DIAMONDS, 3));
       list.add(new Card(CardName.TWO, Suit.DIAMONDS, 2));
   }

    public ArrayList<Card> getList() {
        return new ArrayList<Card>(list);
    }

    public void randomCard() {
       Collections.shuffle(this.list);
       list.get(0);
    }
}
