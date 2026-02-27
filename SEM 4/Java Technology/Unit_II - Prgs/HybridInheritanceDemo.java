interface I1 {public void m1(); public void m2();}
interface I2 {public void m4(); public void m3();}
interface IC extends I1, I2 {public void m5(); public void m6();}
class C implements IC {
    C() {System.out.println("Constructor of C");}
    public void m1() {}
    public void m2() {}
    public void m3() {System.out.println("m3");}
    public void m4() {System.out.println("m4");}
    public void m5() {System.out.println("m5");}
    public void m6() {System.out.println("m6");}
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        C c = new C();
        c.m1();c.m2();c.m3();c.m4();c.m5();c.m6();
    }
}
