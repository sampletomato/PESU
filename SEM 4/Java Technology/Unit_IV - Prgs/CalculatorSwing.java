import javax.swing.*;
import java.awt.*;

public class CalculatorSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator (Swing)");
        JLabel l0 = new JLabel("Calculator App");
        JLabel l1 = new JLabel("Number 1");
        JLabel l2 = new JLabel("Number 2");
        JTextField tf1 = new JTextField(10);
        JTextField tf2 = new JTextField(10);
        JButton add = new JButton("Add");
        JButton sub = new JButton("Subtract");
        JButton multi = new JButton("Multiply");
        JButton div = new JButton("Divide");
        JButton clr = new JButton("Clear");
        
        add.addActionListener(e -> {
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            System.out.println("Sum: " + (n1 + n2));
        });

        sub.addActionListener(e -> {
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            System.out.println("Difference: " + (n1 - n2));
        });

        multi.addActionListener(e -> {
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            System.out.println("Product: " + (n1 * n2));
        });

        div.addActionListener(e -> {
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            try {
                System.out.println("Quotient: " + (n1 / n2));
            } catch (ArithmeticException ae) {
                System.out.println("Divisor is 0");
            }
        });

        clr.addActionListener(e -> {
            tf1.setText(null); tf2.setText(null);
        });

        frame.setLayout(new GridLayout(0, 1, 5, 5)); // One column, components stacked vertically with spacing
        frame.add(l0);
        frame.add(l1);
        frame.add(tf1);
        frame.add(l2);
        frame.add(tf2);
        frame.add(add);
        frame.add(sub);
        frame.add(multi);
        frame.add(div);
        frame.add(clr);

        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
