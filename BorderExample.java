import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Border Example");
    JPanel panel = new JPanel(new GridLayout(2, 3));

    Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    Border loweredbevel = BorderFactory.createLoweredBevelBorder();
    Border line = BorderFactory.createLineBorder(Color.GREEN);
    Border empty = BorderFactory.createEmptyBorder(100, 5, 5, 5);
    Border compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
    Border matte = BorderFactory.createMatteBorder(100, 100, 100, 100, Color.RED);

    Font buttonFont = new Font("Arial", Font.BOLD, 24);
    Color buttonColor = new Color(51, 153, 255);

    JButton button1 = new JButton("Raised Bevel Border");
    button1.setFont(buttonFont);
    button1.setForeground(buttonColor);
    button1.setBorder(raisedbevel);

    JButton button2 = new JButton("Lowered Bevel Border");
    button2.setBorder(loweredbevel);

    JButton button3 = new JButton("Line Border");
    button3.setBorder(line);

    JButton button4 = new JButton("Empty Border");
    button4.setBorder(empty);

    JButton button5 = new JButton("Compound Border");
    button5.setBorder(compound);

    JButton button6 = new JButton("Matte Border");
    button6.setBorder(matte);

    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    panel.add(button5);
    panel.add(button6);

    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
