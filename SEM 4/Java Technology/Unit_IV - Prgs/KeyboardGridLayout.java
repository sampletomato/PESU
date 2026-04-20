import javax.swing.*; import java.awt.*;
public class KeyboardGridLayout {
    static int capsOn = 0;
    public static void main(String[] args) {
        JFrame f = new JFrame("Keyboard");
        String alpha = "qwertyuiopasdfghjklzxcvbnm";
        JLabel l = new JLabel("");
        JButton[] alphaButtons = new JButton[26];
        for(int i = 0; i < alphaButtons.length; i++)
            alphaButtons[i] = new JButton(String.valueOf(alpha.charAt(i)));
        JButton caps = new JButton("Caps Lock");
        caps.setOpaque(true);
        JButton backspace = new JButton("Backspace");
        JButton clear = new JButton("Clear");
        JButton space = new JButton("Space");
        caps.addActionListener(e -> {
            if(capsOn == 0) {
                caps.setBackground(Color.GREEN);
                for(JButton b: alphaButtons)
                    b.setText(b.getText().toUpperCase());
                capsOn = 1;
            }
            else {
                caps.setBackground(null);
                for(JButton b: alphaButtons)
                    b.setText(b.getText().toLowerCase());
                capsOn = 0;
            }
        });
        space.addActionListener(e -> {
            l.setText(l.getText() + " ");
        });
        backspace.addActionListener(e -> {
            if(l.getText().length() > 0)
                l.setText(l.getText().substring(0, l.getText().length() - 1));
        });
        clear.addActionListener(e -> {
            l.setText("");
        });
        for(JButton b: alphaButtons) {
            b.addActionListener(e -> {
                l.setText(l.getText() + b.getText());
            });
        }
        JPanel p1 = new JPanel(), p2 = new JPanel();
        p1.setBounds(0, 0, 1000, 300);
        p2.setBounds(0, 310, 1000, 450);
        p2.setLayout(new GridLayout(3, 10));
        for(JButton b: alphaButtons)
            p2.add(b);
        p2.add(clear); p2.add(backspace); p2.add(space); p2.add(caps);
        l.setFont(new Font("Ariel", 30, 30));
        p1.add(l);
        f.add(p1); f.add(p2);
        f.setSize(1000, 800);
        f.setLayout(null);
        f.setVisible(true);
    }
}