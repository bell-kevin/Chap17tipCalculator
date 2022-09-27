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
        mealCostBox = new JTextField(15);
        outputBox = new JTextField(10);
        outputBox.setEditable(false);
        add(mealCostPrompt);
        add(mealCostBox);
        add(outputBox);
        add(button1);
        add(button2);
        add(button3);
        mealCostBox.addActionListener(new Listener());
    } // end createContents method
//******************************************************************************

    private class Listener implements ActionListener {//InnerClass eventHandling

        public void actionPerformed(ActionEvent e) {

        } // end actionPerformed
    } // end Listener class
//******************************************************************************

    public static void main(String[] args) {
        new tipCalculator();
    } // end main method
} // end Chap17tipCalculator class
