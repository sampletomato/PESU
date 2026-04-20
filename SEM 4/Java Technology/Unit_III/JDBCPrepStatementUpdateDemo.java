import java.util.*; import java.sql.*;
public class JDBCPrepStatementUpdateDemo {
    public static void main(String[] args) throws SQLException {
        String user = "root", pw = "root1234", url = "jdbc:mysql://localhost:3306/classroom";
        Connection c = DriverManager.getConnection(url, user, pw);
        String pq = "UPDATE student SET marks = marks + ? WHERE marks < ?";
        PreparedStatement ps = c.prepareStatement(pq);
        Scanner sc = new Scanner(System.in);
        System.out.println("Threshold: ");
        int threshold = sc.nextInt();
        System.out.println("Grace: ");
        int grace = sc.nextInt();
        ps.setInt(1, grace);
        ps.setInt(2, threshold);
        System.out.println(ps.executeUpdate() + " rows affected");
    }
}
