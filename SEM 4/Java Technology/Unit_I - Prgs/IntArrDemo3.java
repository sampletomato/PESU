import java.util.*;
public class IntArrDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            newArr[i] = arr[i] * arr[i];
        }
        for(int item: newArr) System.out.println(item);
    }
}
