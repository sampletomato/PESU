import java.util.*;
public class ScalarMulti3DArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r = sc.nextInt(), c = sc.nextInt();
        int f = 1;
        int x[][][] = new int[n][r][c];
        int result[][] = new int[r][c];
        for(int i = 0; i < x.length; i++) // Outer
            for(int j = 0; j < x[i].length; j++) // Each Row
                for(int k = 0; k < x[i][j].length; k++) // Each Item
                    x[i][j][k] = sc.nextInt();
        for(int[][] matrix: x) {
            for(int[] row: matrix) {
                for(int item: row)
                    System.out.print(item + " ");
                System.out.println(); // After each row
            }
            System.out.println(); // After each matrix
        }
        for(int[][] matrix: x)
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    f *= matrix[i][j];
                    result[i][j] = f;
                }
                f = 1;
            }
                    
        for(int[] row: result) {
            for(int item: row)
                System.out.print(item + " ");
            System.out.println();
        }
    }    
}
