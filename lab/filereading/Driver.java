package code.lab.filereading;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Driver
{

    private static final String [] IMAGE_EXTENSIONS = {"jpg", "jpeg", "png", "gif"};
    private static final String [] TEXT_EXTENSIONS = {"txt"};


    public static void main (String [] args)
    {
    System.out.println("Enter file name: ");
    Scanner scanner = new Scanner(System.in);
    String fileName = scanner.nextLine();


    String extension = fileName.split("\\.")[1]; //specify the extension
    scanner.close();

     // checking file extension
     if (Arrays.stream(IMAGE_EXTENSIONS).anyMatch(extension::equals))
     {
         readImageFile(fileName);
     }

     if (Arrays.stream(TEXT_EXTENSIONS).anyMatch(extension::equals))
     {
         readTextFile(fileName);
     }

     else
     {
         System.out.println("Unknown extension");
     }

    }

    private static void readImageFile(String fileName)
    {
        System.out.println("Reading image file: " + fileName);
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File(fileName)); //fileName here gets changed to the image eg. "Strawberry.jpeg"
            img = new BufferedImage(1,1, BufferedImage.TYPE_INT_RGB); //write out a new image, proves loading works

            ImageIO.write(img, "jpg", new File(fileName));
        }
        catch (IOException e)
        {
            //System.out.println("Error reading image file: " + fileName);
        }
    }

    private static void readTextFile(String fileName)
    {
        System.out.println("Reading text file " + fileName);
        //FileReader fileReader = null;

        try
        {
            FileReader filereader = new FileReader(fileName);//Java insists on try and catch to even work
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String line;
            while (true)//((line = bufferedReader.readLine()) != null)
            {
                line = bufferedReader.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + fileName);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }


}
