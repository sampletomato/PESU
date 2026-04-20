import javax.swing.*; import java.awt.*; import java.awt.event.*;;
public class KeyEventsWithLogic {
    public static void main(String[] args) {
        JFrame f = new JFrame("Key Event + Category");
        JLabel l1 = new JLabel("Key: ");
        JLabel l2 = new JLabel("Category");
        l1.setFont(new Font("Ariel", 30, 30));
        l2.setFont(new Font("Ariel", 30, 30));
        f.add(l1); f.add(l2);
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
            }
        });
        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
