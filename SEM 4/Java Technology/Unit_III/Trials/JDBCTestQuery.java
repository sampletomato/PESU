import java.sql.*;

public class JDBCTestQuery {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "root1234";

        try {

            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT NOW()");

            while(rs.next()) {
                System.out.println("Database Time: " + rs.getString(1));
            }

            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}