import javax.swing.*;

import java.awt.*;

public class JavaBasic {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Hemanta");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel
        JPanel panel = new JPanel();

        JLabel logo = new JLabel();
        JLabel logo2 = new JLabel("HUnchha Digitala");
        logo2.setFont(new Font("Poppins", Font.PLAIN, 30));

        ImageIcon imageIcon = new ImageIcon("1.png");
        Image logoImage = imageIcon.getImage();
        Image resizedLogo = logoImage.getScaledInstance(200, 200, 0);

        JTextField text = new JTextField();
        text.setColumns(10);
        text.setText("Hello");

        JTextArea area = new JTextArea();
        area.setColumns(10);
        area.setRows(2);

        JPasswordField pass = new JPasswordField("Please");
        pass.setBackground(Color.BLACK);

        JCheckBox checkBox = new JCheckBox("helo", true);
        // checkBox.setText("Are you read?");

        JToggleButton tglBtn = new JToggleButton("Are you sure", true);
        
        JSlider slider = new JSlider();
        slider.setValue(89);

        logo.setIcon(new ImageIcon(resizedLogo));
        panel.add(logo);
        panel.add(logo2);
        panel.add(text);
        panel.add(area);
        panel.add(pass);
        panel.add(checkBox);
        panel.add(tglBtn);
        panel.add(slider);
        panel.setBackground(Color.GREEN);
        
        // frame.setBounds(300,400, 300,300);
        frame.setVisible(true);
    }
}
