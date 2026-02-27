public class TypeCastDemo {
    public static void main(String[] args) {
        float f = 3.14f;
        int i = (int) f;
        System.out.println(i);
        System.out.println();
        String s = "100";
        int y = Integer.parseInt(s);
        System.out.println(y);
        char c = '1';
        int z = (int) c;
        System.out.println(z);
    }
}
