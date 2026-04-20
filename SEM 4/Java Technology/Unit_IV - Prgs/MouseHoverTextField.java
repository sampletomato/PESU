import javax.swing.*; import java.awt.event.*;

public class MouseHoverTextField {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField tf = new JTextField(20);
        JLabel l = new JLabel("");
        l.setBounds(100, 150, 200, 30);
        tf.setBounds(100, 100, 200, 30);
        f.add(tf);
        f.add(l);
        tf.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                l.setText("Mouse Hovered");
            }
            public void mouseExited(MouseEvent e) {
                l.setText("");
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
