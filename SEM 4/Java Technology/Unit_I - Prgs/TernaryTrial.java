import java.util.Scanner;

public class TernaryTrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenCount = 0, oddCount = 0;
        n % 2 == 0 ? "Even" + ++evenCount : "Odd" + ++oddCount;
        sc.close();
    }
}
