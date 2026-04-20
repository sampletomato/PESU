import java.sql.*;

public class JDBCSmokeTest {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "root1234";

        try {

            Connection conn = DriverManager.getConnection(url, user, password);

            System.out.println("JDBC Connection Successful!");
            System.out.println("Connected to database.");

            conn.close();

        } catch (Exception e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}