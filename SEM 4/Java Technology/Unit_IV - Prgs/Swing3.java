import java.awt.Color;import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;
public class Swing3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Component Positioning");
        JLabel label = new JLabel("Something");
        label.setOpaque(false);
        label.setBackground(Color.GREEN);
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(400, 400);
    }
}
