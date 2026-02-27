public class JaggedDemo {
    public static void main(String[] args) {
        int a[][] = {{1}, {4, 5}, {7, 8, 9}};
        for(int[] row: a) {
            for(int item: row)
                System.out.print(item + "\t");
            System.out.println();
        }
    }
}
