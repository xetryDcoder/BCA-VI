import javax.swing.*;
import java.awt.*;
import java.util.Set;
import java.awt.color.*;

class JavaInnerPlane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 300);

        JPanel p1 = new JPanel();
        p1.setPreferredSize(new Dimension(800, 50));
        p1.setBorder(BorderFactory.createRaisedBevelBorder());

        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(200, 800));
        p2.setBorder(BorderFactory.createRaisedBevelBorder());

        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createLineBorder(Color.red));

        /* pane1 */
        // Setting Up image
        JLabel logo = new JLabel();

        ImageIcon icon = new ImageIcon("1.png");
        Image img = icon.getImage();
        Image resizeImg = img.getScaledInstance(40, 40, 0);
        logo.setIcon(new ImageIcon(resizeImg));

        JLabel cmpName = new JLabel("Welcome to Hunchha");
        cmpName.setFont(new Font("Poppins", Font.PLAIN, 20));

        p1.add(logo);
        p1.add(cmpName);
        /* Pane 1 End */

        /* Center Panel */
        
        
        JLabel user = new JLabel("Username");
        user.setFont(new Font("Poppins", Font.PLAIN, 12));
        user.setBounds(80, 100, 100, 25);
        JTextField userFld = new JTextField(20);

        p2.add(user);
        p2.add(userFld);

        /* End Centre Panel */

        // frame.setLayout(new BorderLayout());
        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.WEST);
        frame.add(p, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}