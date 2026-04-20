import javax.swing.*;
public class Swing2 {
    // Create a Simple Hello, "Name" using Swing with TextField and Button and Label
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Name");
        JLabel label = new JLabel("Hello, Name");
        label.setVisible(false);
        JTextField textField = new JTextField("Enter your name");
        JButton button = new JButton("Submit");
        label.setBounds(10, 10, 200, 30);
        textField.setBounds(10, 50, 200, 30);
        button.setBounds(10, 90, 100, 30);
        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Hello, " + name);
            label.setVisible(true);
        });
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
