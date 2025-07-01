package code.week5_6.RandomCards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Dealer
{
    ArrayList<Card> cards;
    public Dealer(CardDeck deck)
    {
        cards = new ArrayList<Card> (Arrays.asList(deck.getCards()));
    }

    public Card dealCard()
    {
        return cards.removeFirst();
    }

    public void shuffle()
    {
        Collections.shuffle(cards); //means there is a class for collections, static method inside called shuffle
    }

    public boolean hascards()
    {
        return !cards.isEmpty(); //true false
    }
}
