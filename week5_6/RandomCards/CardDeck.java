package code.week5_6.RandomCards;

public class CardDeck
{
    private Card[] cards;

    public CardDeck()
    {
        cards = new Card[52]; //creates card deck
        int counter = 0;

        for (int suit = 0; suit < 4; suit++) //goes through all options using for loop with for loop
        {
            for(int number = 1; number <= 13; number++)
            {
                cards[counter] = new Card(number,suit);
                counter++;
            }
        }
    }

    public Card[] getCards()
    {
        return cards;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("CardDeck has " + cards.length + " cards");

        for (Card card : cards)
        {
            builder.append(card.toString());
        }

        return builder.toString();
    }
}
