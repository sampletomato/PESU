import java.sql.*;
public class JDBCSelectDemo {
    public static void main(String[] args) throws SQLException {
        String user = "root", pw = "root1234", url = "jdbc:mysql://localhost:3306/classroom";
        Connection c = DriverManager.getConnection(url, user, pw);
        Statement s = c.createStatement();
        String q = "SELECT * FROM student ORDER BY marks DESC";
        ResultSet rs = s.executeQuery(q);
        while(rs.next()) {
            System.out.print("SRN: " + rs.getInt("srn"));
            System.out.print(" | Name: " + rs.getString("name"));
            System.out.println(" | Marks: " + rs.getInt("marks"));
        }
        q = "SELECT AVG(marks) AS average_marks FROM student";
        rs = s.executeQuery(q);
        while(rs.next())
            System.out.println("Average: " + 
                rs.getFloat("average_marks"));

    }
}
