import javax.swing.*;

import java.awt.*;

public class JavaLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Hemanta");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel
        JPanel panel = new JPanel();


        JLabel logo = new JLabel();
        JLabel company = new JLabel("Hunchha Digital");
        company.setFont(new Font("Poppins", Font.PLAIN, 30));

        ImageIcon imageIcon = new ImageIcon("1.png");
        Image logoImage = imageIcon.getImage();
        Image resizedLogo = logoImage.getScaledInstance(200, 200, 0);

        logo.setIcon(new ImageIcon(resizedLogo));
        panel.add(logo);
        panel.add(company);

        frame.add(panel);
        
        frame.setVisible(true);
    }
}
