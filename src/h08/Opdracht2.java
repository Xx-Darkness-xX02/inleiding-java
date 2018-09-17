package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht2 extends Applet {
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    int mannenteller;
    int vrouwenteller;
    int jongensteller;
    int meisjesteller;
    int totaal;



    public void init() {
        knop1 = new Button("mannen");
        knop2 = new Button("vrouwen");
        knop3 = new Button("jongens");
        knop4 = new Button("meisjes");
        add (knop1);
        add (knop2);
        add (knop3);
        add (knop4);
        ManKnopListener kl = new ManKnopListener();
        knop1.addActionListener(kl);
        VrouwKnopListener vl = new VrouwKnopListener();
        knop2.addActionListener(vl);
        JongenKnopListener jl = new JongenKnopListener();
        knop3.addActionListener(jl);
        MeisjeKnopListener ml = new MeisjeKnopListener();
        knop4.addActionListener(ml);
    }

    public void paint(Graphics g) {
        g.drawString("mannen  : " + mannenteller ,60,70);
        g.drawString("vrouwen : " + vrouwenteller,60,90);
        g.drawString("jongens : " + jongensteller ,60,110);
        g.drawString("meisjes : " + meisjesteller,60,130);
        g.drawString("totaal : " + totaal,60,150);


    }

    class ManKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannenteller++;
            totaal++;
            repaint();
        }
    }

    class VrouwKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwenteller++;
            totaal++;
            repaint();
        }
    }

    class JongenKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongensteller++;
            totaal++;
            repaint();
        }
    }

    class MeisjeKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisjesteller++;
            totaal++;

        }
    }


}
