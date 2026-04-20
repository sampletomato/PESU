import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class KeyEventsAllDemo {
    static int typeCount = 0, pressCount = 0, releaseCount = 0;
    public static void main(String[] args) {
        Font font = new Font("Arier", 30, 30);
        JFrame f = new JFrame("Key Events All");
        JLabel l1 = new JLabel("Key Typed: ");
        JLabel l2 = new JLabel("Key Pressed: ");
        JLabel l3 = new JLabel("Key Released: ");
        f.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                String s = "Key Typed: " + e.getKeyChar();
                s += ", Count: " + (++typeCount);
                l1.setText(s);
                System.out.println("Typed: " + e.getKeyCode());
            }
            public void keyPressed(KeyEvent e) {
                String s = "Key Pressed: " + e.getKeyChar();
                s += ", Count: " + (++pressCount);
                l2.setText(s);
                System.out.println("Pressed: " + e.getKeyCode());
            }
            public void keyReleased(KeyEvent e) {
                String s = "Key Released: " + e.getKeyChar();
                s += ", Count: " + (++releaseCount);
                l3.setText(s);
                System.out.println("Released: " + e.getKeyCode());
            }
        });
        l1.setFont(font);l2.setFont(font);l3.setFont(font);
        f.add(l1); f.add(l2); f.add(l3);
        f.setLayout(new GridLayout(3, 1));
        f.setSize(600, 600);
        f.setVisible(true);
    }
}
