package code.lab.cardgame;

import java.util.ArrayList;

public class Player
{
    private String name;
    private ArrayList<Card> hand;

    public Player (String name)
    {
        this.name = name;
        hand = new ArrayList<Card>();
    }

    public void addCard (Card card)
    {
        hand.add(card);
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Player " + name + " has " + hand.size() + " has cards\n");

        for (Card card : hand)
        {
            builder.append(card.toString());
        }
        return builder.toString();
    }
}
