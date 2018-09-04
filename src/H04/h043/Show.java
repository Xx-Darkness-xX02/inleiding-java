package H04.h043;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    setBackground(Color.black);
    g.setColor(Color.red);
    g.fillRect(150,50,100,30);
    g.setColor(Color.white);
    g.fillRect(150,80,100,30);
    g.fillRect(145,50,5,200);
    g.setColor(Color.blue);
    g.fillRect(150,110,100,30);

    }


}
