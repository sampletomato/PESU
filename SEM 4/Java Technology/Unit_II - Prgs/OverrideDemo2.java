class Z {
    public void display() {System.out.println(this);}
}
class A extends Z {
    // public void display() {System.out.println(this);}
}

public class OverrideDemo2 {
    public static void main(String[] args) {
        A a = new A();Z z = new Z();
        a.display();z.display();
    }   
}
