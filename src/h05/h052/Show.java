package h05.h052;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {
    int gewicht;
    int weight;
    int weegt;
    int y;
    int y2;
    int y3;

    public void init() {
       gewicht = 80;
       weight = 160;
       weegt = 200;
       y = 300 - weegt;
       y2= 300 - weight;
       y3= 300 - gewicht;
        setSize(1000,800);



    }

    public void paint(Graphics g) {

        g.setColor(Color.blue);
        g.fillRect(100,y3,30,gewicht);
        g.setColor(Color.yellow);
        g.fillRect(160,y2,30,weight);
        g.setColor(Color.red);
        g.fillRect(220,y,30,weegt);
        g.setColor(Color.black);
        g.drawLine(30,300,300,300);
        g.drawLine(30,50,30,300);
        g.drawLine(30,50,300,50);
        g.drawLine(30,100,300,100);
        g.drawLine(30,150,300,150);
        g.drawLine(30,200,300,200);
        g.drawLine(30,250,300,250);
        g.drawString("0", 20,300);
        g.drawString("25", 15,250);
        g.drawString("50", 15,200);
        g.drawString("75", 15,150);
        g.drawString("100",8,100);
        g.drawString("125",8,60);

    }
}