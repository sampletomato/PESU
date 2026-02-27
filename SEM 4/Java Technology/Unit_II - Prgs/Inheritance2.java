class A {
    public void display() {System.out.println("In Grandparent");}
}
class B extends A {
    public void display() {System.out.println("In Parent");}
}
class C extends B {
    public void display() {
        System.out.println("In Child");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        A a = new A(); B b = new B(); C c = new C();
        a.display(); b.display(); c.display();
    }
}
