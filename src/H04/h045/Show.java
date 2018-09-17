package H04.h045;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    setBackground(Color.blue);
    g.setColor(Color.yellow);
    g.fillArc(20, 20, 400, 200, 360, 360);
    }
}
