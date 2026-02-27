class A {
    A() {System.out.println("No Param");}
    A(int a) {System.out.println("One int");}
    A(float a) {System.out.println("One float");}
    A(int a, int b) {System.out.println("Two int");}
}
public class ConstructorDemo {
    public static void main(String[] args) {
        A a1 = new A();A a2 = new A(1);
        A a3 = new A(5.0f);A a4 = new A(10, 20);
    }
}
