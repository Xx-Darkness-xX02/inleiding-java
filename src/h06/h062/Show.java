package h06.h062;

import java.awt.*;
import java.applet.*;

public class Show extends Applet{
    int a;
    int b;
    int c;
    int d;
    int e;
    int uitkomst;
    int uitkomst2;
    int uitkomst3;
    int uitkomst4;
    int uitkomst5;



    public void init(){
       a = 30;
       b = 30;
       c = 60;
       d = 24;
       e = 365;
       uitkomst = (a + b) * c;
       uitkomst2 = d * c;
       uitkomst3 = (d * c) * (a + b);
       uitkomst4 = (e * d) * c;
       uitkomst5 = (e * d * c) * (a + b);



    }
    public void paint(Graphics g) {
        g.drawString("er zitten 60 minuten in een uur dus 60 x 60=" + uitkomst,20,20);
        g.drawLine(0,30,5000,30);
        g.drawString("er zitten 24 uren in een dag dus 24x60=" + uitkomst2,20,45);
        g.drawLine(0,55,5000,55);
        g.drawString("nu weten we hoeveel minuten er in een dag zit dus 1440x60=" + uitkomst3, 20,70);
        g.drawLine(0, 80, 5000,80);
        g.drawString("nu moeten we uirekenen hoeveel minuten er in 1 jaar zit 365x24x60=" + uitkomst4, 20,95);
        g.drawLine(0,105,5000,105);
        g.drawString("nu weten we dat er 525600 minuten in een jaar zit dus 525600x60=" + uitkomst5, 20,120 );

    }
}
