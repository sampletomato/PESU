import javax.swing.*; import java.awt.*; import java.sql.*;
public class SwingJDBCTextFieldRetrieve {
    public static String getBranch(String name) throws SQLException {
        String user = "root", pw = "root1234";
        String url = "jdbc:mysql://localhost:3306/classroom";
        Connection c = DriverManager.getConnection(url, user, pw);
        String branch = "";
        String q = "SELECT branch FROM swing_ui_student WHERE name = '" + name + "'";
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery(q);
        while(rs.next())
            branch = rs.getString(1);
        return branch;
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Retrieve JDBC TextField");
        f.add(new JLabel("Name: "));
        JTextField tf = new JTextField(25);
        f.add(tf);
        JButton submit = new JButton("Submit");
        JButton clear = new JButton("Clear");
        f.add(submit); f.add(clear);
        
        JLabel result = new JLabel("Branch: ");
        f.add(result);
        clear.addActionListener(e -> {
            tf.setText(""); 
            result.setText("Branch: ");
        });
        submit.addActionListener(e -> {
            String name = tf.getText();
            try {result.setText("Branch: " + getBranch(name));}
            catch(SQLException ex) {}
        });

        f.setLayout(new GridLayout(3, 2));
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
