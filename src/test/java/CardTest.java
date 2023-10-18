import models.Card;
import org.junit.jupiter.api.Test;

import static models.Card.Rank.ACE;
import static models.Card.Suit.HEARTS;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CardTest {

    //public final Card card = new Card(Card.Suit.HEARTS, Card.Rank.ACE);
    @Test
    void testToString() {
        Card card = new Card(HEARTS, ACE);
        assertEquals(ACE, card.getRank());
    }

}
