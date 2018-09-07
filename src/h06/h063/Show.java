package h06.h063;

import java.awt.*;
import java.applet.*;

public class Show extends Applet{
    int a;
    int b;
    int uitkomst;



    public void init(){
        a = 2147483647;
        b = 10;
        uitkomst = a + b;



    }
    public void paint(Graphics g) {
        g.drawString("het negatieve getal=" + uitkomst, 20,20);




    }


}
