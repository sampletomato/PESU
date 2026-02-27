import java.util.Scanner;
public class ArraysContinued {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int evenCount = 0, oddCount = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int x = arr[i] % 2 == 0 ? evenCount++ : oddCount++;
        }
        int[] evenArr = new int[evenCount], oddArr = new int[oddCount];
        int j = 0, k = 0;
        System.out.println("Given Array: ");
        for(int item: arr) {
            System.out.println(item);
            if(item % 2 == 0) evenArr[j++] = item * item;
            else  oddArr[k++] = item * item * item;
        }
        for(int it: arr) System.out.println(it);
        System.out.println("-------------");
        for(int it: evenArr) System.out.println(it);
        System.out.println("-------------");
        for(int it: oddArr) System.out.println(it);
        System.out.println("-------------");

    }
}
