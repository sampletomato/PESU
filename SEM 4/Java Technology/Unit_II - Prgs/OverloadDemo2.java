class Z {
    public void show(int a) {System.out.println("int in Z");}
    public void show(float a) {System.out.println("float in Z");}
}
class A extends Z {
    public void show(float a) {System.out.println("float in A");}
}
public class OverloadDemo2 {
    public static void main(String[] args) {
        A a = new A();
        a.show(5);a.show(10.0f);
    }
}