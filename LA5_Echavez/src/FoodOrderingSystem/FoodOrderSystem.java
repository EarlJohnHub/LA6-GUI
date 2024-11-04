package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderSystem extends JFrame {

    private JPanel panelMain;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbnone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    FoodOrderSystem() {
        JRadioButton[] discounts = {rbnone, rb5, rb10, rb15};
        double[] disc = {0, .05, .1, .15};
        JCheckBox[] foods = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
        int[] prices = {100, 80, 65, 55, 50, 40};

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;
                double d = 0;


                for(int i = 0; i < foods.length; i++) {
                    if(foods[i].isSelected()) {
                        total += prices[i];
                    }
                }

                for(int i = 0; i < disc.length; i++) {
                    if(discounts[i].isSelected()) {
                        d = total * disc[i];
                    }
                }
                total -= d;
                String result = Double.toString(total);
                JOptionPane.showMessageDialog(null, "The total price is Php " + result);
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderSystem app = new FoodOrderSystem();
        app.setContentPane(app.panelMain);
        app.setSize(700, 500);
        app.setTitle("Food Ordering System");
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
