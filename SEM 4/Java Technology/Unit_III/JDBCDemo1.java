import java.sql.*;
public class JDBCDemo1 {
    public static void main(String[] args) throws SQLException {
        String user = "root", pw = "root1234";
        String url = "jdbc:mysql://localhost:3306/classroom";
        Connection c = DriverManager.getConnection(url, user, pw);
        Statement s = c.createStatement();
        String q = "insert into student values (101, 'abcd', 95)";
        s.executeUpdate(q);
    }
}