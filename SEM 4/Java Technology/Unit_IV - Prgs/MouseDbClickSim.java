import java.awt.event.*;
import javax.swing.*;

public class MouseDbClickSim {
    public static void main(String[] args) {
        JFrame f = new JFrame("Double Click Mouse Sim");
        JLabel l = new JLabel("");
        l.setBounds(200, 200, 200, 200);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2)
                    l.setText("Double Click at: " + e.getX() + ", " + e.getY());
                else l.setText("");
            }
        });
        f.add(l);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }
}
