import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AdvanceMenu implements ActionListener {
    private JFrame frame;
    private JButton button;
    private JMenuItem menuItem;

    public AdvanceMenu() {
        // Create the main frame
        frame = new JFrame("Swing Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button with a mnemonic
        button = new JButton("Click me");
        button.setMnemonic(KeyEvent.VK_C);
        button.setToolTipText("Click me to do something!");

        // Create a menu item with an accelerator
        menuItem = new JMenuItem("Do something");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        menuItem.setToolTipText("Do something when you press Ctrl+D");
        menuItem.addActionListener(this);

        // Add the button and menu item to the frame
        frame.getContentPane().add(button);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // Display the frame
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Do something when the menu item is clicked
        System.out.println("Doing something...");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AdvanceMenu();
            }
        });
    }
}
