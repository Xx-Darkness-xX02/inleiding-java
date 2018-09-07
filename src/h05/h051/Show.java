package h05.h051;


import java.awt.*;
import java.applet.*;

public class Show extends Applet {
    //declaratie.
    Color lijnkleur;
    Color opvulkleur;
    int breedte;
    int hoogte;


    public void init() {
        //initialisatie.
        lijnkleur = Color.black;
        opvulkleur = Color.magenta;
        breedte = 150;
        hoogte = 60;

    }

    public void paint(Graphics g) {
        g.setColor(lijnkleur);
        g.drawRect(10,30,breedte,hoogte);
        g.drawLine(10,10,150,10);
        g.drawRoundRect(10,120,breedte,hoogte,30,30);
        g.drawOval(370,30,breedte,hoogte);
        g.drawString("lijn", 75,23);
        g.drawString("rechthoek",60,103);
        g.drawString("afgeronde rechthoek",27,193);
        g.drawString("gevulde rechthoek met ovaal", 187, 103);
        g.drawString("gevulde ovaal", 226,194);
        g.drawString("ovaal met taartpunt", 400, 103 );
        g.drawString("circkel", 435, 193 );
        g.setColor(opvulkleur);
        g.fillRect(190,30,breedte,hoogte);
        g.fillOval(190,120,breedte,hoogte);
        g.fillArc(370,30,150,60,90,90);
        g.setColor(lijnkleur);
        g.drawOval(190,30,breedte,hoogte);
        g.drawOval(420,120, 60,60);

    }
}