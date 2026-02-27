import javax.swing.*;

public class SwingSmokeTest {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Smoke Test");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Swing is working!", JLabel.CENTER);
        frame.add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}