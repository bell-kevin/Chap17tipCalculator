/** ****************************************************************************
 * Chap17tipCalculator.java
 * Kevin Bell
 *
 * This GUI program calculates restaurant tips.
 **************************************************************************** */
package chap17tipcalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chap17tipCalculator extends JFrame {

    private static final int WIDTH = 325;
    private static final int HEIGHT = 100;
    private JTextField mealCostBox; // holds user's meal cost
    private JTextField outputBox; // displays tip amount calculation
//******************************************************************************

    public Chap17tipCalculator() {
        setTitle("Tip Calculator");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    } // end constructor method
//******************************************************************************

    private void createContents() {  // Create components and add them to window
        JLabel mealCostPrompt = new JLabel("How much did the meal cost?");
        JButton button1 = new JButton("10% tip");
        JButton button2 = new JButton("15% tip");
        JButton button3 = new JButton("20% tip");
        Listener listener = new Listener();
        mealCostBox = new JTextField(10);
        outputBox = new JTextField(5);
        outputBox.setEditable(false);
        add(mealCostPrompt);
        add(mealCostBox);
        add(outputBox);
        add(button1);
        add(button2);
        add(button3);
        mealCostBox.addActionListener(listener);
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
    } // end createContents method
//******************************************************************************

    private class Listener implements ActionListener {//InnerClass eventHandling

        public void actionPerformed(ActionEvent e) {
            double input; // numeric value for user-entered input
            double output; // tip amount
            try {
                input = Double.parseDouble(mealCostBox.getText());
            } catch (NumberFormatException nfe) {
                input = -1;
            }
            if (e.getSource() == mealCostBox) {
                JOptionPane.showMessageDialog(null, "Click one of the buttons");
            } else {
                outputBox.setText(Double.toString(input));
            } // end if/else condition
        } // end actionPerformed
    } // end Listener class
//******************************************************************************

    public static void main(String[] args) {
        new Chap17tipCalculator();
    } // end main method
} // end Chap17tipCalculator class
