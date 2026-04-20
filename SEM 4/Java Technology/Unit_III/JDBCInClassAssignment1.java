import java.sql.*;
import java.util.Scanner;
public class JDBCInClassAssignment1 {
    public static void main(String[] args) throws SQLException {
        String user = "root", pw = "root1234", url = "jdbc:mysql://localhost:3306/classroom";
        Connection c = DriverManager.getConnection(url, user, pw);
        Statement s = c.createStatement();
        String q = "INSERT INTO student VALUES ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Records: ");
        int srn, marks; String name;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Record " + (i + 1) + ": ");
            System.out.println("SRN: ");
            srn = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Marks: ");
            marks = sc.nextInt();
            q += "(" + srn + ", '" + name + "', " + marks + "), ";
        }
        q = q.substring(0, q.lastIndexOf(", "));
        int r = s.executeUpdate(q);
        System.out.println(r + " Rows Inserted");
    }
}
