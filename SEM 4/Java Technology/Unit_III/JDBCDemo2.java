import java.sql.*;
public class JDBCDemo2 {
    public static void main(String[] args) throws SQLException {
        String user = "root", pw = "root1234";
        String url = "jdbc:mysql://localhost:3306/classroom";
        Connection c = DriverManager.getConnection(url, user, pw);
        String q = "INSERT INTO student VALUES (102, 'efgh', 90)";
        Statement s = c.createStatement();
        int r = s.executeUpdate(q);
        System.out.println(r + " Rows Updated");
    }
}