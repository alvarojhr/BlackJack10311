package Test;

import models.Card;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    public final Card card = new Card(Card.Suit.HEARTS, Card.Rank.ACE);
    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals(Card.Rank.ACE, card.getRank());
    }
}
