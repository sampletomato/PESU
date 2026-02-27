class A {
    public void show(int a) {System.out.println("A: " + a);}
    public void show(float a) {System.out.println("Float");}
}
public class OverloadDemo {
    public static void main(String[] args) {
        A a = new A();
        a.show(5);
        a.show(10.0f);
        a.show(10);
    }
}
