import javax.swing.*;
public class Swing1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Some Title");
        JLabel label = new JLabel("Some Text");
        JButton button = new JButton("Some Button");
        label.setBounds(10, 10, 10, 10);
        label.setSize(100, 100);
        frame.add(label); 
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}