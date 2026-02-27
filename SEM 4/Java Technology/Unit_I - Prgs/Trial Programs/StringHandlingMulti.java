import java.util.Scanner;

public class StringHandlingMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        String input = sc.nextLine();

        // 1. Trim the input
        String trimmed = input.trim();

        // 2. Find indices
        int firstAt = trimmed.indexOf('@');
        int firstHash = trimmed.indexOf("#");
        int lastAt = trimmed.lastIndexOf('@');
        int lastHash = trimmed.lastIndexOf("#");

        // 3. Extract parts using substring
        String name = trimmed.substring(0, firstAt);
        String department = trimmed.substring(firstAt + 1, firstHash);
        String empIdStr = trimmed.substring(firstHash + 1);

        // 4. Case conversions
        String nameUpper = name.toUpperCase();
        String deptLower = department.toLowerCase();

        // 5. Convert employee ID using valueOf
        int empId = Integer.valueOf(empIdStr);

        // 6. Replace operations
        String replacedChar = trimmed.replace('@', ':');
        String finalString = replacedChar.replace("#", " ID ");

        // 7. Display output
        System.out.println(trimmed);
        System.out.println(nameUpper);
        System.out.println(deptLower);
        System.out.println(firstAt);
        System.out.println(firstHash);
        System.out.println(lastAt);
        System.out.println(lastHash);
        System.out.println(name);
        System.out.println(department);
        System.out.println(empId);
        System.out.println(finalString);

        sc.close();
    }
}