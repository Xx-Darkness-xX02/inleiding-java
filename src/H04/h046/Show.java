package H04.h046;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.gray);
        g.fillRect(150,60,45,90);
        g.fillRect(168,150,10,200);
        g.setColor(Color.red);
        g.fillOval(163,70,20,20);
        g.setColor(Color.ORANGE);
        g.fillOval(163,95,20,20);
        g.setColor(Color.GREEN);
        g.fillOval(163,120,20,20);
    }
}

