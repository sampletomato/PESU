class A {
    A() {System.out.println("Class A Constructor");}
}
class B {
    B() {System.out.println("Class B Constructor");}
}
class C extends A, B {
    C() {
        // Call Constructors of A and B
        super();
        System.out.println("Class C Constructor");
    }
}

public class MultipleInheritanceTrial {
    
}
