/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingball;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author salmamabrouk
 */
public class BouncingBall {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Salma's Bouncing Ball");
        Panel p = new Panel();
        f.setContentPane(p);
        f.setSize(600, 300);
        f.setVisible(true);
    }
}

class Panel extends JPanel implements Runnable {

    int x;
    int y;
    int dx;
    int dy;

    public Panel() {
        this.setBackground(Color.lightGray);
        new Thread(this).start();
        x = 50;
        y = 50;
        dx = 15;
        dy = 15;
    }

    @Override
    public void run() {

        while (true) {

            try {
                this.repaint();
                Thread.sleep(100);

            } catch (InterruptedException e) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (y + dy > this.getHeight() - 20 || y + dy < 0) {
            dy = -dy;
        }
        if (x + dx > this.getWidth() - 20 || x + dx < 0) {
            dx = -dx;
        }
        x += dx;
        y += dy;

        g.drawOval(x, y, 20, 20);
        g.setColor(Color.green);
        g.fillOval(x, y, 20, 20);
    }
}