package H04.H047;


import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.red);
        g.setColor( Color.black);
        g.drawRoundRect(100,100,80,80,10,10);
        g.setColor(Color.white);
        g.fillRoundRect(101,101,79,79,9,9);
        g.setColor( Color.black);
        g.fillOval(150,110,20,20);
        g.fillOval(150,150,20,20);
        g.fillOval(110,150,20,20);
        g.fillOval(110,110,20,20);
    }
}