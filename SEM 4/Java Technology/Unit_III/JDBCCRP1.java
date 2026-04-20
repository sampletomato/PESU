import java.sql.*;
import java.util.*;
public class JDBCCRP1 {
    public static void main(String[] args) throws SQLException {
        for(int i = 0; i < 50; i++)
            System.out.println();
        String user = "root", pw = "root1234";
        String url = "jdbc:mysql://localhost:3306/classroom";
        Connection c = DriverManager.getConnection(url, user, pw);
        // 1. Creation of table
        String q = "create table if not exists emp (id int primary key, name varchar(25), basicpay int, dept varchar(20), rating int)";
        Statement s = c.createStatement();
        s.execute(q);
        // 2. Display the Schema
        System.out.println("Table Created / Ready");
        q = "DESC emp";
        ResultSet rs = s.executeQuery(q);
        while(rs.next()) {
            System.out.print("Column: " + rs.getString("Field"));
            System.out.println(" | Type: " + rs.getString("Type"));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int id, basicpay, rating;
        String name, dept;
        String pq = "REPLACE INTO emp VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = c.prepareStatement(pq);
        for(int i = 1; i <= n; i++) {
            System.out.println("Row " + i);
            System.out.print("id: ");
            id = sc.nextInt(); sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Basic Pay: ");
            basicpay = sc.nextInt(); sc.nextLine();
            System.out.print("Department: ");
            dept = sc.nextLine();
            System.out.print("Rating: ");
            rating = sc.nextInt(); sc.nextLine();
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, basicpay);
            ps.setString(4, dept);
            ps.setInt(5, rating);
            ps.addBatch();
        }
        ps.executeBatch();
        // 4. Show all records
        q = "SELECT * FROM emp";
        rs = s.executeQuery(q);
        while(rs.next()) {
            System.out.print("id: " + rs.getInt("id"));
            System.out.print(" | Name: " + rs.getString("name"));
            System.out.print(" | Basic Pay: " + rs.getInt("basicpay"));
            System.out.print(" | Dept: " + rs.getString("dept"));
            System.out.println(" | Rating: " + rs.getInt("rating"));
            System.out.println("----------------");
        }
        // 5. Display Avg. Rating
        q = "SELECT avg(rating) FROM emp";
        rs = s.executeQuery(q);
        if(rs.next()) {
            System.out.println("Average Rating: " + rs.getDouble(1));
        }
        // 6. Display Avg. Rating by Dept.
        q = "SELECT dept, avg(rating) FROM emp GROUP BY dept";
        rs = s.executeQuery(q);
        while(rs.next()) {
            System.out.print("Dept: " + rs.getString(1));
            System.out.println(" | Average Rating: " + rs.getDouble(2));
        }
        // 7. For all employees with rating of >= 7, increase their basic pay by 20%
        q = "UPDATE emp SET basicpay = basicpay * 1.2 WHERE rating >= 7";
        s.executeUpdate(q);
        // 8. Show average basicpay overall
        q = "SELECT avg(basicpay) FROM emp";
        rs = s.executeQuery(q);
        if(rs.next()) {
            System.out.println("Average Basic Pay: " + rs.getDouble(1));
        }
        // 9. Show average basicpay by dept.
        q = "SELECT dept, avg(basicpay) FROM emp GROUP BY dept";
        rs = s.executeQuery(q);
        while(rs.next()) {
            System.out.print("Dept: " + rs.getString(1));
            System.out.println(" | Average Basic Pay: " + rs.getDouble(2));
        }
        // 10. Display all records
        q = "SELECT * FROM emp";
        rs = s.executeQuery(q);
        while(rs.next()) {
            System.out.print("id: " + rs.getInt("id"));
            System.out.print(" | Name: " + rs.getString("name"));
            System.out.print(" | Basic Pay: " + rs.getInt("basicpay"));
            System.out.print(" | Dept: " + rs.getString("dept"));
            System.out.println(" | Rating: " + rs.getInt("rating"));
            System.out.println("----------------");
        }

    }
}
