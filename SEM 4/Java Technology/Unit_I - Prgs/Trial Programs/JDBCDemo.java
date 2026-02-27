import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_demo",
                "root",
                "root1234"
            );
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name, marks FROM student");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("marks"));
            }
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
