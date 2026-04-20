import java.awt.*; import javax.swing.*;
public class SwingDialog {
    public static void main(String[] args) {
        JFrame f = new JFrame("Dialog Demo");
        JButton b = new JButton("Click here to Login");
        f.add(b);

        b.addActionListener(e -> {
            JDialog d = new JDialog(f, "Login Dialog", true);
            JLabel l1 = new JLabel("Username: ");
            JLabel l2 = new JLabel("Password: ");
            JTextField username = new JTextField(20);
            JPasswordField pw = new JPasswordField(20);
            JButton b1 = new JButton("Submit");
            d.setLayout(null);
            d.setBounds(100, 100, 400, 400);
            d.setVisible(true);
        });

        f.setSize(600, 600);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
