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
    private JTextField output; // displays tip amount calculation
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
    // Create components and add them to window

    private void createContents() {
        JLabel mealCostPrompt = new JLabel("How much did the meal cost?");
        mealCostBox = new JTextField(15);
        output = new JTextField(10);
        add(mealCostPrompt);
        add(mealCostBox);
        add(output);
        mealCostBox.addActionListener(new Listener());
    } // end createContents method
//******************************************************************************

    public static void main(String[] args) {
        new tipCalculator();
    } // end main method
} // end Chap17tipCalculator class
