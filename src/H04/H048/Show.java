package H04.H048;


import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(4,9,150,9);
        g.drawString("lijn", 77,20);
        g.drawRect(4,25,150,60);
        g.drawString("rechthoek", 63 , 96);
        g.drawRoundRect(4,100,150,60,30,30);
        g.drawString("afgeronde rechthoek",25,171 );
        g.drawString("ovaal in rechthoek",189,96);
        g.drawString("gevulde ovaal",200,171 );
        g.drawOval(314,25,150,60);
        g.drawString("ovaal met taartpunt",334,96);
        g.drawOval(364,100,60,60);
        g.drawString("cirkel", 380, 175);
        g.setColor(Color.magenta);
        g.fillRect(160,25,150,60 );
        g.fillOval(160,100,150,60);
        g.fillArc(314, 23, 150, 70, 100, 90);
        g.setColor(Color.black);
        g.drawOval(160,25,150,60);





    }
}