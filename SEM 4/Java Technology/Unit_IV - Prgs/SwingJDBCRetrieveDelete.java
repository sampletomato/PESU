import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*; import java.awt.*; import java.sql.*;
public class SwingJDBCRetrieveDelete {
    static String user = "root", pw = "root1234";
    static String url = "jdbc:mysql://localhost:3306/classroom";
    public static String[] getNames() throws SQLException {
        int n = 0;
        Connection c = DriverManager.getConnection(url, user, pw);
        String q = "SELECT COUNT(name) FROM swing_ui_student";
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery(q);
        while(rs.next()) 
            n = rs.getInt(1);
        String[] names = new String[n];
        int index = 0;
        q = "SELECT name FROM swing_ui_student";
        rs = st.executeQuery(q);
        while (rs.next()) 
            names[index++] = rs.getString(1);
        return names;
    }
    public static ResultSet jdbcSelect(String name) throws SQLException {
        Connection c = DriverManager.getConnection(url, user, pw);
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM swing_ui_student WHERE name = '" + name + "'");
        return rs;
    }
    public static void jdbcDelete(String name) throws SQLException {
        Connection c = DriverManager.getConnection(url, user, pw);
        String q = "DELETE FROM swing_ui_student WHERE name = '" + name + "'";
        Statement st = c.createStatement();
        st.executeUpdate(q);
    }
    public static void main(String[] args) throws SQLException {
        JFrame f = new JFrame("Swing JDBC Retrieve + Delete");
        JLabel select = new JLabel("Select");
        String[] options = getNames();
        JComboBox<String> combo = new JComboBox<>(options);
        JButton submit = new JButton("Submit");
        JButton delete = new JButton("Delete");
        JLabel nameData = new JLabel();
        JLabel branchData = new JLabel();
        JLabel clxData = new JLabel();
        JLabel clxiiData = new JLabel();
        JLabel addrData = new JLabel();
        f.add(select); f.add(combo); 
        f.add(submit); f.add(delete);
        delete.addActionListener(e -> {
            try {
                String name = String.valueOf(combo.getSelectedItem());
                jdbcDelete(name);
            }
            catch(SQLException exc) {}
        });
        submit.addActionListener(e -> {
            try {
                String name = String.valueOf(combo.getSelectedItem());
                ResultSet rs = jdbcSelect(name);
                while(rs.next()) {
                    nameData.setText(rs.getString(1));
                    branchData.setText(rs.getString(2));
                    clxData.setText(rs.getString(3));
                    clxiiData.setText(rs.getString(4));
                    addrData.setText(rs.getString(5));
                }
            }
            catch(SQLException exc) {}
        });
        f.add(new JLabel("Name: ")); f.add(nameData);
        f.add(new JLabel("Branch: ")); f.add(branchData);
        f.add(new JLabel("Class X: ")); f.add(clxData);
        f.add(new JLabel("Class XII: ")); f.add(clxiiData);
        f.add(new JLabel("Address: ")); f.add(addrData);

        f.setLayout(new GridLayout(7, 2));
        f.setSize(500, 500);
        f.setVisible(true);
        getNames();
    }
}
