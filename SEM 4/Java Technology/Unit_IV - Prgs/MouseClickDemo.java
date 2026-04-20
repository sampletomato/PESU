import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class MouseClickDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Click Event");
        f.addMouseListener(
            new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    System.out.println("Clicked at: " + 
                    e.getX() + ", " + e.getY());
                }
                public void mousePressed(MouseEvent e) {
                    System.out.println("Mouse Pressed");
                }
                public void mouseReleased(MouseEvent e) {
                    System.out.println("Mouse Released");
                }
                public void mouseEntered(MouseEvent e) {
                    f.setForeground(Color.GREEN);
                }
                public void mouseExited(MouseEvent e) {
                    f.setForeground(null);
                }
            }
        );
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
