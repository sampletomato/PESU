import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class MouseEventsDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Mouse Events Demo");
        JLabel l = new JLabel("Click Anywhere");
        l.setOpaque(true);
        JLabel l2 = new JLabel("");
        l2.setBounds(300, 300, 200, 100);
        l.setBounds(100, 100, 300, 150);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String s = "X: " + e.getX() + ", Y: " + e.getY();
                s += ", Button: " + e.getButton();
                s += ", Click Count: " + e.getClickCount();
                l.setText(s);
            }
            public void mouseEntered(MouseEvent e) {
                l.setBackground(Color.GREEN);
            }
            public void mouseExited(MouseEvent e) {
                l.setBackground(Color.RED);
            }
            public void mousePressed(MouseEvent e) {
                String s = "Mouse Pressed at: " + e.getX() + ", " + e.getY();
                l2.setText(s);
            }
            public void mouseReleased(MouseEvent e) {
                String s = "Mouse Released at: " + e.getX() + ", " + e.getY();
                l2.setText(s);
            }
        });
        f.add(l); f.add(l2); f.setLayout(null);
        f.setSize(600, 600); f.setVisible(true);
    }
}
