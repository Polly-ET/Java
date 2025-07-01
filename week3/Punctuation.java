package code.week3;

public class Punctuation
{
    public static void main(String[] args)
    {
        int fullstops = 0,commas = 0,hyphen = 0;
        String poem;


        poem =("Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go.\n" +
                "-that was a nice poem-\n" +
                "the end.");

        for (int i = 0; i < poem.length(); i++) {
            char ch = poem.charAt(i);
            if (ch == '.') {
                fullstops++;
            } else if (ch == ',') {
                commas++;
            } else if (ch == '-') {
                hyphen++;
            }
        }

        System.out.println("Commas " + commas );
        System.out.println("Hyphen " + hyphen);
        System.out.println("Full stops " + fullstops);

    }
}
