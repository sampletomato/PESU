import javax.swing.*;import java.awt.*;
public class Swing4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Some New Program");
        JLabel label = new JLabel("Name: ");
        JTextField tf = new JTextField(25);
        JButton b = new JButton("Click Here");
        frame.add(label); frame.add(b); frame.add(tf); 
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
