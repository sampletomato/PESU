import javax.swing.*;import java.awt.*;
public class Swing5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Some New Program");
        JLabel label = new JLabel("Name: ");
        JTextField tf = new JTextField(25);
        JButton b = new JButton("Click Here");
        label.setBounds(50, 50, 100, 30);
        tf.setBounds(150, 50, 200, 30);
        b.setBounds(150, 100, 120, 30);
        b.addActionListener(e -> {
            String name = tf.getText();
            System.out.println("Hello, " + name);
        });
        frame.add(label); frame.add(tf); frame.add(b); 
        frame.setLayout(new FlowLayout());
        frame.setSize(900, 900); frame.setVisible(true);
    }
}