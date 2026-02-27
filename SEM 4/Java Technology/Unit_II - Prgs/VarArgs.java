class Addition {
    public int add(int a, int b) {
        return 0;
    }
    public int add(int... a) {
        int s = 0;
        for(int i: a) s += i; return s;
    }
}
public class VarArgs {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(1, 2, 3, 4));
        System.out.println(a.add(1, 2, 3));
        System.out.println(a.add(1, 2));
        System.out.println(a.add(1));
        System.out.println(a.add());
    }
}
