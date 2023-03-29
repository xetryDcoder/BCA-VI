package EventProgram;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcOne  extends JFrame {
    public JTextField numberOne, numberTwo;
    public JComboBox operator;
    String operatorsSymbol[] = { "+", "-", "/", "*" };

    CalcOne() {

        createGui();
    }

    public static void main(String[] args) {
        new CalcOne ();
    }

    void createGui() {

        setSize(300, 300);
        setTitle("Hello Guys");

        JPanel panel = new JPanel();

        numberOne = new JTextField(20);
        numberTwo = new JTextField(20);
        operator = new JComboBox(operatorsSymbol);

        JButton submit = new JButton("Submit");
        submit.addKeyListener(new EnterPressed());

        panel.add(submit);
        panel.add(numberOne);
        panel.add(operator);
        panel.add(numberTwo);

        add(panel);

        setVisible(true);
    }

    class EnterPressed extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                Double numOne = Double.parseDouble(numberOne.getText());
                Double numTwo = Double.parseDouble(numberTwo.getText());
                String oper = (String) operator.getSelectedItem();

                double result = 0.0;
                switch (oper) {
                    case "+":
                        result = numOne + numTwo;
                        break;
                    case "-":
                        result = numOne - numTwo;
                        break;
                    case "*":
                        result = numOne * numTwo;
                        break;
                    case "/":
                        result = numOne / numTwo;
                        break;
                }

                JOptionPane.showMessageDialog(null, "Result: " + result);
            }
        }
    }

}
