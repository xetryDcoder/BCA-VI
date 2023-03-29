import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Shapes extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Draw a red rectangle
        g2d.setColor(Color.RED);
        Rectangle2D rect = new Rectangle2D.Double(50, 50, 100, 100);
        g2d.fill(rect);

        // Draw a blue circle
        g2d.setColor(Color.BLUE);
        Ellipse2D ellipse = new Ellipse2D.Double(100, 100, 100, 100);
        g2d.fill(ellipse);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new Shapes());
        frame.setVisible(true);
    }
}
