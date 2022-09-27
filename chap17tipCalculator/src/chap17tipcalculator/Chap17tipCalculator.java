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
import java.text.*;

public class Chap17tipCalculator extends JFrame {

    private static final int WIDTH = 325;
    private static final int HEIGHT = 150;
    private JTextField mealCostBox; // holds user's meal cost
    private JTextField outputBox; // displays tip amount calculation
    private JButton button1 = new JButton("10% tip");
    private JButton button2 = new JButton("15% tip");
    private JButton button3 = new JButton("20% tip");
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
        Listener listener = new Listener();
        mealCostBox = new JTextField(10);
        button1.setBackground(Color.YELLOW);
        button2.setBackground(Color.MAGENTA);
        button3.setBackground(Color.CYAN);
        outputBox = new JTextField(25);
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
            NumberFormat money = NumberFormat.getCurrencyInstance();
            double input, total = 0, tip = 0;
            String tipOnly = null, totalOnly = null;
            if (e.getSource() == mealCostBox) {
                JOptionPane.showMessageDialog(null, "Click one of the buttons");
            } else {
                try {
                    input = Double.parseDouble(mealCostBox.getText());
                    if (e.getSource() == button1) {
                        Container contentPane = getContentPane();
                        if (e.getSource() == button1) {
                            contentPane.setBackground(Color.LIGHT_GRAY);
                        } // end if condition
                        tip = input * .1;
                        tipOnly = money.format(tip);
                        total = tip + input;
                        totalOnly = money.format(total);
                    } // end if condition
                    outputBox.setText(" Tip: " + tipOnly
                            + " Total: " + totalOnly);
                    if (e.getSource() == button2) {
                        Container contentPane = getContentPane();
                        if (e.getSource() == button2) {
                            contentPane.setBackground(Color.PINK);
                        } // end if condition
                        tip = input * .15;
                        tipOnly = money.format(tip);
                        total = tip + input;
                        totalOnly = money.format(total);
                    } // end if condition
                    outputBox.setText(" Tip: " + tipOnly
                            + " Total: " + totalOnly);
                    if (e.getSource() == button3) {
                        Container contentPane = getContentPane();
                        if (e.getSource() == button3) {
                            contentPane.setBackground(Color.ORANGE);
                        } // end if condition
                        tip = input * .2;
                        tipOnly = money.format(tip);
                        total = tip + input;
                        totalOnly = money.format(total);
                    } // end if condition
                    outputBox.setText(" Tip: " + tipOnly
                            + " Total: " + totalOnly);
                } catch (NumberFormatException nfe) {
                    input = -1;
                } // end try/catch   
            } // end if/else condition
        } // end actionPerformed
    } // end Listener class
//******************************************************************************

    public static void main(String[] args) {
        new Chap17tipCalculator();
    } // end main method
} // end Chap17tipCalculator class
