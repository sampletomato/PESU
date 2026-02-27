public class TrialChar {
    public static void main(String[] args) {
        int[] x = new int[128];
        char ch = 'A';
        x[ch] = 65;
        for(int i: x) {
            if(i > 0)
                System.out.println(i);
        }
        int a = 'A';
        char ch1 = 97;
        System.out.println(a + "\n" + ch1);
    }
}
