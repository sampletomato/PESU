class A {
    public void show() {System.out.println("Class A");}
}
class B extends A {
    public void show() {System.out.println("Class B");}
}
public class OverrideDemo {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
