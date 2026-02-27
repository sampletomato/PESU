interface A {public void methodA();}
class B implements A {
    B() {System.out.println("Class B Constructor");}
    public void methodB() {System.out.println("methodB");}
    public void methodA() {System.out.println("methodA");}
}
interface C extends A {public void methodC();}
class D extends B implements C {
    D() {
        super();
        System.out.println("Constructor of D");
    }
    public void methodC() {System.out.println("methodC");}
    public void methodD() {System.out.println("methodD");}
}

public class DiamondProblemWithBAsClass {
    public static void main(String[] args) {
        D d = new D();
        d.methodA();d.methodB();d.methodC();d.methodD();
    }
}
