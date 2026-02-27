import java.util.*;
public class IntArrayDemo {
    public static void main(String[] args) {
        System.out.println("Enter Size of Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " Items: ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for(int i = 0; i < a.length; i++)
            System.out.println("Item " + i + ": " + a[i]);
        System.out.println("Using Enhanced for: ");
        for(int item: a)
            System.out.println("Item: " + item);
    }
}
