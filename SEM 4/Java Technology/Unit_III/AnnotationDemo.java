class MathCalc {
    public int add(int a, int b) {return a + b;}
    public int sub(int a, int b) {return a - b;}
    public int multi(int a, int b) {return a * b;}
}
public class AnnotationDemo {
    public static void main(String[] args) {
        MathCalc m = new MathCalc();
        int a = m.add(10, 20);
        int b = m.sub(10, 20);
        int c = m.multi(10, 20);
        System.out.println("Sum: " + a);
        if(a < 0) System.out.println("Negative");
        else System.out.println("Positive");
        System.out.println("Diff: " + b);
        if(b < 0) System.out.println("Negative");
        else System.out.println("Positive");
        System.out.println("Product: " + c);
        if(c < 0) System.out.println("Negative");
        else System.out.println("Positive");
    }
}
