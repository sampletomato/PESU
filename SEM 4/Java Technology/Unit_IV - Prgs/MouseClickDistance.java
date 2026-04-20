import javax.swing.*; import java.awt.event.*; 
public class MouseClickDistance {
    static float distance = 0.0f, x = 0.0f, y = 0.0f;
    public static void main(String[] args) {
        JFrame f = new JFrame("Mouse Click Distance");
        JLabel l = new JLabel("Distance: ");
        l.setBounds(100, 100, 300, 100);
        f.add(l);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                float currX = e.getX(), currY = e.getY();
                distance = (float) Math.sqrt(Math.pow(currX - x, 2) + Math.pow(currY - y, 2));
                x = currX; y = currY;
                l.setText("Distance: " + Math.round(distance));
            }
        });
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);

    }
}
