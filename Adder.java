import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Adder implements ActionListener {
    private JFrame frame;
    private JTextField field1;
    private JTextField field2;
    private JButton button;

    public Adder() {
        // Create the main frame
        frame = new JFrame("Adder Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the input fields
        field1 = new JTextField();
        field2 = new JTextField();

        // Create the button to perform the addition
        button = new JButton("Add");
        button.addActionListener(this);

        // Add the input fields and button to the frame
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("First number: "));
        panel.add(field1);
        panel.add(new JLabel("Second number: "));
        panel.add(field2);
        panel.add(new JLabel(""));
        panel.add(button);
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        // Display the frame
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the values from the input fields
        double num1 = Double.parseDouble(field1.getText());
        double num2 = Double.parseDouble(field2.getText());

        // Compute the sum
        double sum = num1 + num2;

        // Display the result in a dialog box
        JOptionPane.showMessageDialog(frame, "The sum is " + sum);
    }

    public static void main(String[] args) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        System.out.println(screenHeight + " " + screenWidth);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Adder();
            }
        });
    }
}
