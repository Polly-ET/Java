package code.lab.InterfaceExample;

import code.lab.InterfaceExample.Items.Dice;
import code.lab.InterfaceExample.Shapes.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class Drawing extends JFrame
{
    private final int XSIZE = 640;
    private final int YSIZE = 480;
    private ArrayList<Drawable> drawings = new ArrayList<>();


    public Drawing()
    {
        this.setSize(XSIZE, YSIZE);
        this.setVisible(true);
        //this.paint(getGraphics());

        Dice dice = new Dice();
        dice.setLocation(new Point(100, 100));
        Circle circle = new Circle(5);
        circle.setLocation(new Point(200,200));
        circle.setColor(Color.CYAN);
        //drawings.add(circle);


        this.getContentPane().addMouseListener (new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                dice.roll();
                System.out.println(dice.toString());
                System.out.println(circle.toString());
                paint(getGraphics());
            }
        });
    }


    public void paint(Graphics g)
    {
        setBackground(Color.RED);
        //Dice.paint(g);
        for(Drawable drawable : drawings)
        {
            drawable.paint(g);
        }
    }






}
