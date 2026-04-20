import javax.swing.*; import java.awt.*;
public class SwingGridLayout {
    public static void main(String[] args) {
        JFrame f = new JFrame("Grid Layout Demo");
        JLabel l1 = new JLabel("11");
        JLabel l2 = new JLabel("12");
        JLabel l3 = new JLabel("21");
        JLabel l4 = new JLabel("22");
        JLabel l5 = new JLabel("Additional");
        JLabel l6 = new JLabel("Again");
        JLabel l7 = new JLabel("New");
        l1.setBackground(Color.GRAY);
        l2.setBackground(Color.PINK);
        l3.setBackground(Color.CYAN);
        l1.setOpaque(true); l2.setOpaque(true);
        l3.setOpaque(true);
        f.setSize(300, 300);
        f.setLayout(new GridLayout(2, 2));
        f.add(l4); f.add(l3); f.add(l2); f.add(l1); 
        f.add(l5); f.add(l6); f.add(l7);
        f.setVisible(true);
    }
}
