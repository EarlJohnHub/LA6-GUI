package LeapYearChecker;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {

    private JPanel panelMain;
    private JTextField yearTextField;
    private JButton checkYearButton;

    LeapYearChecker() {

        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String year = yearTextField.getText();

                int yr = Integer.parseInt(year);

                if(yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0) {
                    JOptionPane.showMessageDialog(null,"Leap year");

                } else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });

    }
    public static void main(String[] args) {
        LeapYearChecker ly = new LeapYearChecker();
        ly.setContentPane(ly.panelMain);
        ly.setTitle("LeapYearChecker");
        ly.setSize(400,300);
        ly.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ly.setVisible(true);
    }
}
