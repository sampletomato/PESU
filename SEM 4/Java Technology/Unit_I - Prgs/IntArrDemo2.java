import java.util.*;
public class IntArrDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Input Array: ");
        for(int item: arr) System.out.println(item);
        for(int i = 0; i < arr.length; i++)
            arr[i] *= arr[i];
        System.out.println("Input Array After Square: ");
        for(int item: arr) System.out.println(item);
    }
}
