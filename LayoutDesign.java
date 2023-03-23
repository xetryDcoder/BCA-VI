import javax.swing.*;
import java.awt.*;
import java.util.Set;
import java.awt.color.*;

class LayoutDesign{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 300);

        JPanel p1 = new JPanel();
        p1.setPreferredSize(new Dimension(800,50));
        p1.setBorder(BorderFactory.createRaisedBevelBorder());

        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(50, 800));
        p2.setBorder(BorderFactory.createRaisedBevelBorder());

        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createLineBorder(Color.red));
        
        frame.setLayout(new BorderLayout());
        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.WEST);
        frame.add(p, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}