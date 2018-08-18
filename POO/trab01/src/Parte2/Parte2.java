package Parte2;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Helia
 */
public class Parte2 extends JPanel {
     public Parte2() {
        setPreferredSize(new Dimension(400,500));
        setVisible(true);
    }
    
     public void paintComponent(Graphics g){
      g.drawOval(130, 30, 280, 280);
      g.fillOval(180, 150, 30, 50);
      g.fillOval(340, 180, 30, 5);
     g.drawArc(220, 250, 130, 10, 350, 210);       
    }
     
     public static void main(String[] args) {
         JFrame frame = new JFrame("Piscando o olho");
        frame.setContentPane(new Parte2());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}