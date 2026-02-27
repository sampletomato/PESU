interface A {public void methodA();}
interface B extends A {public void methodB();}
interface C extends A {public void methodC();}
class D implements B, C {
    D() {System.out.println("Constructor of D");}
    public void methodA() {System.out.println("methodA");}
    public void methodB() {System.out.println("methodB");}
    public void methodC() {System.out.println("methodC");}
    public void methodD() {System.out.println("methodD");}
}

public class DiamondProblem {
    public static void main(String[] args) {
        D d = new D();
        d.methodA();d.methodB();d.methodC();d.methodD();
    }
}
