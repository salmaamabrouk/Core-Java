/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textmarquee;
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
public class TextMarquee {

       public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setTitle("Moving Text");
        Panel panel = new Panel();
        myFrame.setContentPane(panel);
        myFrame.setSize(800, 300);
        myFrame.setVisible(true);
    }

}

class Panel extends JPanel implements Runnable {

    int x;

    public Panel() {
        this.setBackground(Color.DARK_GRAY);
        this.setForeground(Color.pink);
        this.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 22));
        new Thread(this).start();
        x=100;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.repaint();
                x += 10;
                Thread.sleep(200);
            } 
            catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (x > this.getWidth()) {
            x = 0;
        }
        g.drawString("I'm a text and I'm MOVING ;)", x, 150);
    }
}