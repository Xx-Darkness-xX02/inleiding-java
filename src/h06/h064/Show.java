package h06.h064;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    double a, b, c, d, gemiddelde;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        gemiddelde = (a + b + c) / d;
        setSize(1900,800);

    }

    public void paint(Graphics g) {
        gemiddelde = gemiddelde * 10;
        int gemInt = (int) gemiddelde;
        gemiddelde = (double) gemInt;
        gemiddelde = gemiddelde / 10;
        g.drawString("een cursist wil het gemiddelde bereken van 3 cijfers een 5.9 een 6.3 en een 6,9 om het gemiddelde te berekenen moet hij alle 3 de cijfers bij elkaar optellen en vervolgens delen door 3=" + gemiddelde, 20, 20);

    }

}




