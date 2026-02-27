interface I1 {
    public void display();
    public void show();
}
class A implements I1 {
    A() {System.out.println("In Constructor of A");}
    public void display() {System.out.println("No param");}
    public void display(int a) {System.out.println("Display");}
    public void show() {System.out.println("Show");}
}
public class InterfaceDemo {
    public static void main(String[] args) {
        A a = new A();
    }
}