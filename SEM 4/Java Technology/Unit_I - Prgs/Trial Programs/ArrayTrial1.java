import java.util.Scanner;
public class ArrayTrial1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Default Values: ");
        for(int item: a)
            System.out.println(item);
        // Populating with data
        a = new int[]{1, 2, 3, 4, 5};
        System.out.println("Post Init");
        for(int item: a)
            System.out.println(item);
        // Create new Array with same items
        int b[] = {1, 2, 3, 4, 5};
        System.out.println("New Array: ");
        for(int item: a)
            System.out.println(item);
        // Address Check: 
        System.out.println("Address Check: ");
        System.out.println("Address of a: " + System.identityHashCode(a) + "\nAddress of b: " + System.identityHashCode(b));
        // Arrays are not equal
        System.out.println("Equality Check of a, b: \n" + a.equals(b));
        // Default Values of a Char Array
        char cArr[] = new char[5];
        System.out.println("New Array of Chars (Default Values): ");
        for(char c: cArr) 
            System.out.println(c);
        // Default Values of a String Array
        String sArr[] = new String[5];
        System.out.println("New Array of Strings (Default Values): ");
        for(String s: sArr) 
            System.out.println(s);
        // User Input Integer Array + Display + Find Squares
        System.out.println("Enter the number of integers in array (<100): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] u = new int[n];
        System.out.println("Enter the Array Items: ");
        for(int i = 0; i < n; i++) {
            System.out.println("Item " + (i + 1) + ": ");
            u[i] = sc.nextInt();
        }
        System.out.println("Array Input: ");
        for(int item: u) 
            System.out.println(item);
        int squares[] = new int[n];
        for(int i = 0; i < n; i++)
            squares[i] = u[i] * u[i];
        System.out.println("Squares: ");
        for(int item: squares)
            System.out.println(item);
        // Iterating a string
        String q = new String("Some String");
        System.out.println("Iterating over String: " + q + ": ");
        for(int i = 0; i < q.length(); i++)
            System.out.println(q.charAt(i));
    }    
}
