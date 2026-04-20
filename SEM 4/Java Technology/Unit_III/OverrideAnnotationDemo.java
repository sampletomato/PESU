class Parent {
    public void display() {System.out.println("Parent");}
}
class Child extends Parent {
    @Override
    @Deprecated
    public void display() {System.out.println("Child");}
}

public class OverrideAnnotationDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
