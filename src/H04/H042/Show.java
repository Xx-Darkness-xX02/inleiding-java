package H04.H042;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

      setBackground(Color.white);
      g.setColor(Color.black);
      g.drawRect(20,90,250,200);
      g.drawRect(60, 220,50,70);
      g.drawRect(200,180,30,30);
      g.drawLine(20,90,145,5);
      g.drawLine(270,90,145,5);

    }


}