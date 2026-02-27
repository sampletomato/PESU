class A {
    protected int x; // Private int available in A
    A(int x) {this.x = x;}
}
class B extends A {
    private int y; // Private int available only in B
    private int x;
    B(int x, int y) {
        super(x); // Calling superclass (A) Constructor
        this.y = y; // Initialising y, which is available only in B
    }
    public void display() {
        System.out.println(super.x);System.out.println(y);
    }

}
public class Inheritance1 {
    public static void main(String[] args) {
        B b = new B(1, 2);
        b.display();
    }
}
