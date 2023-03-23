import javax.swing.*;
import java.awt.*;

class ClassOne {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello BCA VI");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel name = new JLabel("Hello There");
        name.setFont(new Font("Poppins", Font.PLAIN, 40));

        JLabel logo = new JLabel();

        ImageIcon img = new ImageIcon("1.png");
        Image convertedImage = img.getImage();
        Image resizImage = convertedImage.getScaledInstance(200, 200, 0);
        
        logo.setIcon(new ImageIcon(resizImage));
        
        JTextField text = new JTextField();
        text.setColumns(10);
        text.setText("Hello");

        JTextArea are = new JTextArea();
        are.setColumns(10);
        are.setRows(2);

        JPasswordField pass = new JPasswordField();
        pass.setColumns(10);

        JCheckBox checkBox = new JCheckBox("helo", true);
        // checkBox.setText("Are you read?");

        JToggleButton tglBtn = new JToggleButton("Are you sure", true);
        
        JSlider slider = new JSlider();
        slider.setValue(50);

        panel.add(name);
        panel.add(logo);
        panel.add(text);
        panel.add(are);
        panel.add(pass);
        panel.add(checkBox);
        panel.add(tglBtn);
        panel.add(slider);

        frame.add(panel);

        frame.setVisible(true);

    }
}