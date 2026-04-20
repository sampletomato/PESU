import javax.swing.*; import java.awt.*;
public class SwingGridCalcNoFor {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator Grid No Arr(Buttons)");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        // And So On
        f.setSize(600, 60);
        f.setLayout(new GridLayout(4, 4));
        f.add(b1); f.add(b2); // And So On
        // Set Action Listeners to all 16 Buttons
        f.setVisible(true);

    }
}
