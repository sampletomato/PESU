import java.sql.*; import java.awt.*; import javax.swing.*;
public class SwingReadFromSQL {
    public static Connection createConn() throws SQLException {
        String user = "root", pw = "root1234";
        String url = "jdbc:mysql://localhost:3306/classroom";
        return DriverManager.getConnection(url, user, pw);
    }
    public static void main(String[] args) throws SQLException {
        for(int i = 0; i < 50; i++) System.out.println();
        Connection c = createConn();
        // Find no. of rows
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT COUNT(*) FROM student");
        int size = 0;
        while(rs.next()) 
            size = rs.getInt(1);
        // Create Array of Names (From Database Table, Dynamic)
        String[] array = new String[size];
        int index = 0;
        rs = s.executeQuery("SELECT name FROM student");
        while(rs.next())
            array[index++] = rs.getString(1);
        JFrame f = new JFrame("Fetch Student Data");
        JComboBox<String> nameCombo = new JComboBox<>(array);
        JLabel l1 = new JLabel("Select Name: ");
        JButton b = new JButton("Show Info");
        JLabel resultJLabel = new JLabel("");

        f.add(l1); f.add(nameCombo); f.add(b); f.add(resultJLabel);
        b.addActionListener(e -> {
            try {
                String searchName = nameCombo.getSelectedItem().toString();
                Connection conn = createConn();
                Statement st = conn.createStatement();
                ResultSet r = st.executeQuery(
                    "SELECT * FROM student WHERE name = '" + searchName + "'");
                String result = "";
                while(r.next()) {
                    result = result + "Name: " + r.getString(2);
                    result = result + ", SRN: " + r.getInt(1);
                    result = result + ", Marks: " + r.getInt(3);
                }
                resultJLabel.setText(result);
            }
            catch(SQLException se) {se.printStackTrace();}
        });

        f.setSize(600, 600);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}