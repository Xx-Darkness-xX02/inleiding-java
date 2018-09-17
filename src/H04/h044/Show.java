package H04.h044;
//dit soort troep.*;
import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(30,30,30,290);
        g.drawLine(30,290,400,290);
        g.drawLine(20,50,400,50);
        g.drawLine(20,80,400,80);
        g.drawLine(20,110,400,110);
        g.drawLine(20,140,400,140);
        g.drawLine(20,170,400,170);
        g.drawLine(20,200,400,200);
        g.drawLine(20,230,400,230);
        g.drawLine(20,260,400,260);
        g.drawString("0",10,290);
        g.drawString("15",5,265);
        g.drawString("30",5,235);
        g.drawString("45",5,205);
        g.drawString("60",5,175);
        g.drawString("75",5,145);
        g.drawString("90",5,115);
        g.drawString("105",1,85);
        g.drawString("120",1,55);
        g.setColor(Color.red);
        g.fillRect(60,90,30,200);
        g.setColor(Color.orange);
        g.fillRect(120,130,30,160);
        g.setColor(Color.yellow);
        g.fillRect(180, 210,30,80);


    }
}