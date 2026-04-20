import java.util.*;
import java.sql.*;
public class JDBCAggregationDemo {
    public static void displayAll(Connection c) throws SQLException {
        Statement s = c.createStatement();
        String q = "SELECT * FROM student_new";
        ResultSet rs = s.executeQuery(q);
        while(rs.next()) {
            System.out.print("SRN: " + rs.getInt("srn"));
            System.out.print(" | Name: " + rs.getString("name"));
            System.out.print(" | Dept: " + rs.getString("dept"));
            System.out.println(" | Marks: " + rs.getInt("marks"));
        }
    }
    public static void insertNewRecord(Connection c) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SRN:");
        int srn = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter Department:");
        String dept = sc.nextLine();
        System.out.println("Enter Marks:");
        int marks = sc.nextInt();
        String pq = "INSERT INTO student_new VALUES (?, ?, ?, ?)";
        PreparedStatement ps = c.prepareStatement(pq);
        ps.setInt(1, srn);
        ps.setString(2, name);
        ps.setString(3, dept);
        ps.setInt(4, marks);
        System.out.println(ps.executeUpdate() + " record inserted.");

    }
    public static void overallStats(Connection c) throws SQLException {
        Statement s = c.createStatement();
        String q = "SELECT COUNT(marks) AS student_count, AVG(marks) AS average_marks, MAX(marks) AS max_marks, MIN(marks) AS min_marks FROM student_new";
        ResultSet rs = s.executeQuery(q);
        while(rs.next()) {
            System.out.println("Total Students: " + rs.getInt("student_count"));
            System.out.println("Average: " + rs.getFloat("average_marks"));
            System.out.println("Max: " + rs.getInt("max_marks"));
            System.out.println("Min: " + rs.getInt("min_marks"));
        }
    }
    public static void deptWiseStats(Connection c) throws SQLException {
        Statement s = c.createStatement();
        String q = "SELECT dept, COUNT(marks) AS student_count, AVG(marks) AS average_marks, MAX(marks) AS max_marks, MIN(marks) AS min_marks FROM student_new GROUP BY dept";
        ResultSet rs = s.executeQuery(q);
        while(rs.next()) {
            System.out.println("Department: " + rs.getString("dept"));
            System.out.println("Total Students: " + rs.getInt("student_count"));
            System.out.println("Average: " + rs.getFloat("average_marks"));
            System.out.println("Max: " + rs.getInt("max_marks"));
            System.out.println("Min: " + rs.getInt("min_marks"));
            System.out.println();
        }
    }
    public static void particularDeptStats(Connection c) throws SQLException {
        // Display all departments using SELECT DISTINCT from Database Table, let user select which department by entering the name of the department, then display the stats for that department, case insensitive and then display count, max, min, avg of marks for that department
        Statement s = c.createStatement();
        String q = "SELECT DISTINCT dept FROM student_new";
        ResultSet rs = s.executeQuery(q);
        List<String> departments = new ArrayList<>();
        System.out.println("Departments:");
        while(rs.next()) {
            String dept = rs.getString("dept");
            departments.add(dept);
            System.out.println(dept);
        }
        System.out.println("Enter the department name:");
        Scanner sc = new Scanner(System.in);
        String deptName = sc.nextLine();
        if(!departments.contains(deptName)) {
            System.out.println("Invalid Department Name");
            return;
        }
        q = "SELECT COUNT(marks) AS student_count, AVG(marks) AS average_marks, MAX(marks) AS max_marks, MIN(marks) AS min_marks FROM student_new WHERE dept = '" + deptName + "'";
        rs = s.executeQuery(q);
        while(rs.next()) {
            System.out.println("Department: " + deptName);
            System.out.println("Total Students: " + rs.getInt("student_count"));
            System.out.println("Average: " + rs.getFloat("average_marks"));
            System.out.println("Max: " + rs.getInt("max_marks"));
            System.out.println("Min: " + rs.getInt("min_marks"));
        }
    }
    public static void displayMenu(Connection c) throws SQLException {
        System.out.println("1. Display All");
        System.out.println("2. Insert New Record");
        System.out.println("3. Overall Statistics");
        System.out.println("4. All Departments Dept Wise Statistics");
        System.out.println("5. Particular Department Statistics");
        System.out.println("6. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice) {
            case 1: displayAll(c); break;
            case 2: insertNewRecord(c); break;
            case 3: overallStats(c); break;
            case 4: deptWiseStats(c); break;
            case 5: particularDeptStats(c); break;
            case 6: System.exit(0);
            default: System.out.println("Invalid Choice");
        }
    }
    public static void main(String[] args) throws SQLException {
        String user = "root", pw = "root1234", url = "jdbc:mysql://localhost:3306/classroom";
        Connection c = DriverManager.getConnection(url, user, pw);
        System.out.println("\033[H\033[2J");
        System.out.flush();
        while(true) displayMenu(c);
    }
}