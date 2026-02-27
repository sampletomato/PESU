import java.util.Scanner;
public class JaggedArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt(); // r -- No. of Rows -- Fixed
        int c;
        int[][] jagged = new int[r][]; // Row Count Fixed, Col count variable
        // Accept Col count for each row + Accept Input Item
        for(int i = 0; i < jagged.length; i++) {
            System.out.println("Enter the number of columns in row " + i + ":");
            c = sc.nextInt();
            jagged[i] = new int[c];
            for(int j = 0; j < jagged[i].length; j++)
                jagged[i][j] = sc.nextInt();
        }
        System.out.println("Given Jagged Array: ");
        for(int[] row: jagged) {
            for(int item: row)
                System.out.print(item + "\t");
            System.out.println();
        }
        int primeProduct = 1, nonPrimeProduct = 1;
        for(int[] row: jagged)
            for(int item: row) {
                if(isPrime(item))
                    primeProduct *= item;
                else
                    nonPrimeProduct *= item;
            }
        System.out.println("Product of Primes: " + primeProduct);
        System.out.println("Product of Non-Primes: " + nonPrimeProduct);
    }
    static boolean isPrime(int n) {
        // Input -- n, an Integer
        // Returns true if n is prime, else false
        if(n < 1) return false;
        for(int i = 2; i <= n / 2; i++)
            if(n % i == 0) return false;
        return true;
    }
}
