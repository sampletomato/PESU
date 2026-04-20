import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class KeyEvents3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Key Events + Modifiers");
        JLabel l1 = new JLabel("Key: ");
        JLabel l2 = new JLabel("Category: ");
        JLabel l3 = new JLabel("Shift: ");
        JLabel l4 = new JLabel("Control: ");
        JLabel l5 = new JLabel("Alt: ");
        l3.setOpaque(true); l4.setOpaque(true);
        l5.setOpaque(true);
        Font font = new Font("Ariel", 30, 30);
        l1.setFont(font); l2.setFont(font); l3.setFont(font);
        l4.setFont(font); l5.setFont(font);
        f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5);
        f.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                l1.setText("Key: " + c);
                if(Character.isLetter(c))
                    l2.setText("Category: Alphabet");
                else if(Character.isDigit(c))
                    l2.setText("Category: Digit");
                else
                    l2.setText("Category: Others");
                if(e.isShiftDown()) {
                    l3.setText("Shift: Y");
                    l3.setBackground(Color.GREEN);
                }
                else {
                    l3.setText("Shift: N");
                    l3.setBackground(Color.RED);
                }
                if(e.isControlDown()) {
                    l4.setText("Control: Y");
                    l4.setBackground(Color.GREEN);
                }
                else {
                    l4.setText("Control: N");
                    l4.setBackground(Color.RED);
                }
                if(e.isAltDown()) {
                    l5.setText("Alt: Y");
                    l5.setBackground(Color.GREEN);
                }
                else {
                    l5.setText("Alt: N");
                    l5.setBackground(Color.RED);
                }
            }
        });
        f.setLayout(new GridLayout(5, 1));
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
