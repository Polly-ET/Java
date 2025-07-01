package code.lab.cardgame;

public class Card
{
    private int number;//don't want values to be changed by someone else
    private int suit;

    private final int SPADES = 0; //capitals to convey that this value should not change
    private final int HEARTS = 1;
    private final int CLUBS = 2;
    private final int DIAMONDS = 3;


    public Card (int number, int suit)
    {
        this.number = number;
        this.suit = suit;
    }

    @Override
    public String toString()
    {
        String str = switch (suit)//extended switch
        {
            case SPADES -> "Spades";
            case HEARTS -> "Hearts";
            case CLUBS -> "Clubs";
            case DIAMONDS -> "Diamonds";
            default -> "NO SUIT"; //in case something isn't there
        };

        return number + " of " + str + "\n";
    }
}
