package H04.h041;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g)
    {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, 250,200,20);
        g.drawLine(50,250,350,250);
        g.drawLine(350,250,200,20);


    }

}