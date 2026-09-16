package testrig;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TestRig extends JPanel {

    private JTextField paidField;
    private JButton calcButton;
    
    // Array to hold each coin/bill line to draw
    private String[] breakdownLines = new String[]{"Enter amount paid above"};

    public TestRig() {
        super();
        setLayout(new FlowLayout());

        // Input for Amount Paid
        add(new JLabel("Amount Paid: $"));
        paidField = new JTextField(6);
        add(paidField);

        calcButton = new JButton("Calculate");
        add(calcButton);

        // Calculate breakdown into bills and coins
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double paid = Double.parseDouble(paidField.getText());
                    int cents = (int) Math.round(paid * 100);

                    int hundreds = cents / 10000; cents %= 10000;
                    int fifties  = cents / 5000;  cents %= 5000;
                    int twenties = cents / 2000;  cents %= 2000;
                    int tens     = cents / 1000;  cents %= 1000;
                    int fives    = cents / 500;   cents %= 500;
                    int ones     = cents / 100;   cents %= 100;

                    int quarters = cents / 25;    cents %= 25;
                    int dimes    = cents / 10;    cents %= 10;
                    int nickels  = cents / 5;     cents %= 5;
                    int pennies  = cents;

                    breakdownLines = new String[]{
                        "Bills: $100x" + hundreds + " | $50x" + fifties + " | $20x" + twenties + " | $10x" + tens + " | $5x" + fives + " | $1x" + ones,
                        "Coins: 25¢x" + quarters + " | 10¢x" + dimes + " | 5¢x" + nickels + " | 1¢x" + pennies
                    };
                } catch (NumberFormatException ex) {
                    breakdownLines = new String[]{"Invalid input!"};
                }
                repaint(); // Refresh panel graphics
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Your original drawn graphics
        g.drawString("Out of all the clutter, find simplicity", 110, 80);
        g.drawString("-- Albert Einstein", 130, 100);

        // Draw individual bill and coin output line-by-line
        int y = 140;
        for (String line : breakdownLines) {
            g.drawString(line, 20, y);
            y += 20;
        }
    }

    public static void main(String arg[]) {
        JFrame frame = new JFrame("BasicJPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 250);

        TestRig panel = new TestRig();

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}