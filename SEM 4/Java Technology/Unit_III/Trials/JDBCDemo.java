import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbc_demo",
            "root",
            "root1234"
        );
        Statement stmt = con.createStatement();
        String q = "INSERT INTO student (id, name, marks) VALUES (4, 'Alice', 95)";
        stmt.executeUpdate(q);
        ResultSet rs = stmt.executeQuery("SELECT name, marks FROM student");
        while (rs.next()) 
            System.out.println(rs.getString("name") + " | " + rs.getInt("marks"));
    }
}
