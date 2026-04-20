import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class KeyEventsBasicDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 50; i++) System.out.println();
        JFrame f = new JFrame("Key Events Basic");
        JLabel l = new JLabel("Key: ");
        l.setFont(new Font("Ariel", 30, 30));
        f.add(l);
        f.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                System.out.println("Key Typed: " + c);
                l.setText("Key: " + c);
            }
        });
        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
