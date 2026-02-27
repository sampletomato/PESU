import java.util.Scanner;
public class FactorialRecursion {
    public static void main(String x[]) {
        System.out.println("Input an Integer: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(factorial(n));
        System.out.println();
    }
    static int factorial(int n) {
        // Base Case
        if(n == 0 || n == 1) return 1;
        // Recursive Call
        return n * factorial(n - 1);
    }
}
