package code.week5_6.RandomCards;

public class Driver
{
    public static void main(String[] args)
    {
        CardDeck deck = new CardDeck();
        String[] names = {"Polly"};

        Player[] players = new Player[1];
        for (int i = 0; i < 1; i++)
        {
            players[i] = new Player(names[i]);
        }

        Dealer dealer = new Dealer(deck);

        dealer.shuffle();

        for (int i = 0; i < 5; i++)
        {
            for (Player player : players)
            {
                Card card = dealer.dealCard();
                player.addCard(card);
            }
        }

        //while (dealer.hascards())
       // {
        //    for (Player player : players)
          //  {
       //         Card card = dealer.dealCard();
        //        player.addCard(card);
         //   }
            //System.out.println(dealer.dealCard());
       // }

        //Card card = dealer.dealCard();
        //System.out.println(card);
        //card = dealer.dealCard();
        //System.out.println(card);

        for (Player player : players)
        {
            System.out.print(player);
        }

    }
}
