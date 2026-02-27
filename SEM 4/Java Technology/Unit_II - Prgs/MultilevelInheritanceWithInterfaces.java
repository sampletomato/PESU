interface I1 {public void method1(); public void method2();}
interface I2 extends I1 {public void method3(); public void method4();}
class C implements I2 {
    C() {System.out.println("Blank Constructor Call");}
    public void method1() {System.out.println("method1");}
    public void method2() {System.out.println("method2");}
    public void method3() {System.out.println("method3");}
    public void method4() {System.out.println("method4");}
    public void methodInClass() {System.out.println("Method only in class C");}
}
public class MultilevelInheritanceWithInterfaces {
    public static void main(String[] args) {
        C c = new C();
        c.method1();c.method2();c.method3();c.method4();c.methodInClass();
    }
}
