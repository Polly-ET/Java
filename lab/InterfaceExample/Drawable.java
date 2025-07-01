package code.lab.InterfaceExample;

import code.lab.InterfaceExample.Shapes.Circle;

import java.awt.*;

//interfaces are abstract
public interface Drawable
{
    void paint(Graphics g);
    void setColor(Color color);
    void setLocation(Point point);
}
