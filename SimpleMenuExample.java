import java.awt.*;
import javax.swing.*;

class SimpleMenuExample {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Menu Ex");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("EDIT");
        JMenuItem menuItem1 = new JMenuItem("Open");
        menu.add(menuItem1);
        menuBar.add(menu);
        
        frame.add(BorderLayout.NORTH , menuBar);
        frame.setVisible(true);
    }
}
