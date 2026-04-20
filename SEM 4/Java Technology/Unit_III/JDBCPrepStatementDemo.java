import java.util.Scanner;
import java.sql.*;
public class JDBCPrepStatementDemo {
    public static void main(String[] args) throws SQLException {
        String user = "root", pw = "root1234", url = "jdbc:mysql://localhost:3306/classroom";
        Connection c = DriverManager.getConnection(url, user, pw);
        String pq = "insert into student values (?, ?, ?)";
        PreparedStatement ps = c.prepareStatement(pq);
        Scanner sc = new Scanner(System.in);
        int n, marks, srn;
        String name;
        System.out.println("Enter number of rows: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println("Record " + i + ": ");
            System.out.println("SRN: ");
            srn = sc.nextInt();
            sc.nextLine(); // Flush the input screen
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Marks: ");
            marks = sc.nextInt();
            ps.setInt(1, srn);
            ps.setString(2, name);
            ps.setInt(3, marks);
            ps.executeUpdate();
        }
    }
}
