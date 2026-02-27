import java.util.Scanner;
public class TwoDArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), i, j;
        int[][] arr = new int[m][n];
        for(i = 0; i < arr.length; i++)
            for(j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();
        for(int[] row: arr) {
            for(int item: row)
                System.out.print(item + "\t");
            System.out.println();
        }
    }
}
