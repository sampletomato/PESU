import javax.swing.*; import java.awt.*; import java.sql.*;
public class SwingJDBCInsert {
    public static void jdbcInsert(String name, String branch, float clx, float clxii, String addr) throws SQLException {
        String user = "root", pw = "root1234";
        String url = "jdbc:mysql://localhost:3306/classroom";
        Connection c = DriverManager.getConnection(url, user, pw);
        String q = "INSERT INTO swing_ui_student VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = c.prepareStatement(q);
        ps.setString(1, name);
        ps.setString(2, branch);
        ps.setFloat(3, clx);
        ps.setFloat(4, clxii);
        ps.setString(5, addr);
        ps.executeUpdate();
    }
    public static void main(String[] args) throws SQLException {
        JFrame f = new JFrame("JDBC Swing Insert");
        JLabel nameLabel = new JLabel("Name: ");
        JLabel branchLabel = new JLabel("Branch: ");
        JLabel clxLabel = new JLabel("Class X: ");
        JLabel clxiiLabel = new JLabel("Class XII: ");
        JLabel addrLabel = new JLabel("Address: ");
        JTextField nametf = new JTextField(25);
        String[] branches = {"--Select--", "BCA", "BBA", "BA", "BE", "BCom"};
        JComboBox<String> branchCombo = new JComboBox<>(branches);
        JTextField clxtf = new JTextField(10);
        JTextField clxiitf = new JTextField(10);
        JTextArea addrta = new JTextArea();
        JButton submit = new JButton("Submit");
        JButton clear = new JButton("Clear");
        clear.addActionListener(e -> {
            nametf.setText("");
            branchCombo.setSelectedIndex(0);
            clxtf.setText("");
            clxiitf.setText("");
            addrta.setText("");
        });
        submit.addActionListener(e -> {
            String name = nametf.getText();
            String branch = String.valueOf(branchCombo.getSelectedItem());
            float clx = Float.valueOf(clxtf.getText());
            float clxii = Float.valueOf(clxiitf.getText());
            String addr = addrta.getText();
            try {
                jdbcInsert(name, branch, clx, clxii, addr);
                clear.doClick();
            }
            catch(SQLException exc) {}
        });
        f.add(nameLabel); f.add(nametf);
        f.add(branchLabel); f.add(branchCombo);
        f.add(clxLabel); f.add(clxtf);
        f.add(clxiiLabel); f.add(clxiitf);
        f.add(addrLabel); f.add(addrta);
        f.add(submit); f.add(clear);
        f.setLayout(new GridLayout(6, 2));
        f.setVisible(true);
        f.setSize(500, 500);
    }
}
