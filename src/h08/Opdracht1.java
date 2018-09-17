package h08;



import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht1 extends Applet {
    Button knop;
    String schermtekst;
    TextField tekstvak;
    Button reset;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("ok");
        reset = new Button("reset");
        KnopListener kl = new KnopListener();
        ResetListener rl = new ResetListener();
        knop.addActionListener(kl);
        reset.addActionListener(rl);
        add(tekstvak);
        add(knop);
        add(reset);

    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60);
        g.drawString("Type een hele lange tekst " +
                "in het tekstvakje " +
                "en klik op Ok", 50, 80);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Jammer, " +
                    "maar nu staat er iets anders");
            repaint();
        }
    }
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}
