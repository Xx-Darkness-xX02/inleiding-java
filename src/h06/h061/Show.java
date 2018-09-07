package h06.h061;

import java.awt.*;
import java.applet.*;


public class    Show extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 112;
        b = 1;
        c = 4;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("113 gedeeld door 4 = " + uitkomst, 20, 20);
        g.drawString("Ik krijg 28 euro", 20,40);
        g.drawString("Ali krijgt 28 euro", 20,60);
        g.drawString("Jeannette krijgt 28 euro", 20,80);
        g.drawString("Jan krijgt 28 euro", 20,100);

    }
}