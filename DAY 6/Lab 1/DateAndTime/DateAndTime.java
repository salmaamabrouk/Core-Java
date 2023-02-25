/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salmamabrouk
 */
public class DateAndTime {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Simple Date and Time JFrame Application");
        Panel p = new Panel();
        f.setContentPane(p);
        f.setSize(500, 300);
        f.setVisible(true);

    }
}

class Panel extends JPanel implements Runnable {

    public Panel() {
        this.setBackground(Color.magenta);
        this.setForeground(Color.white);
        this.setFont(new Font("Times", Font.BOLD, 20));
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            try {
                this.repaint();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(new Date().toLocaleString(), 100, 100);
    }
}
