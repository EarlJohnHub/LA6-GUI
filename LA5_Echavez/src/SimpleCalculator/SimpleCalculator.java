package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JPanel panelMain;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JTextField lblResult;
    private JButton btnCompute;

    SimpleCalculator() {
        lblResult.setEditable(false);

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());
                String op = null;
                int result = 0;

                if(cbOperations.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Choose an Operation");
                } else {
                    op = (String) cbOperations.getSelectedItem();
                }

                try {
                    switch (op) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if(num2 == 0) {
                                throw new NumberFormatException();
                            }
                            result = num1 / num2;
                            break;
                    }
                } catch(NumberFormatException ev) {
                    JOptionPane.showMessageDialog(null, "Second number cannot be Zero");
                } catch (Exception ev) {
                    ev.getMessage();
                }
                lblResult.setText(Integer.toString(result));
            }
        });


    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.panelMain);
        app.setSize(500,300);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
