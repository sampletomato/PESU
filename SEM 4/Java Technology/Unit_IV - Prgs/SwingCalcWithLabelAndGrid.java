import javax.swing.*; import java.awt.*;
public class SwingCalcWithLabelAndGrid {
    static String expr = "";
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator With Label");
        JButton[] buttons = new JButton[16];
        JLabel l = new JLabel("");
        // Initialise Buttons
        String s = "123+456-789*C0=/";
        for(int i = 0; i < buttons.length; i++) {
            String c = String.valueOf(s.charAt(i));
            buttons[i] = new JButton(c);
        }
        for(JButton b: buttons) {
            b.addActionListener(e -> {
                String t = b.getText();
                if(t.equals("="))
                    l.setText("Evaluated: " + expr);
                else if(t.equals("C")) {
                    expr = "";
                    l.setText(expr);
                }
                else {
                    expr += t;
                    l.setText(expr);
                }
            });
        }
        f.setSize(400, 400);
        f.setLayout(null);
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 400, 50);
        p1.add(l);
        f.add(p1);
        JPanel p2 = new JPanel();
        p2.setBounds(0, 55, 400, 345);
        p2.setLayout(new GridLayout(4, 4));
        for(JButton b: buttons)
            p2.add(b);
        f.add(p2);
        f.setVisible(true);
    }
}
