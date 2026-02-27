class Class1 {
    public void class1Member() {System.out.println("Class 1");}
}
class Class2 extends Class1 {
    public void class2Member() {
        System.out.println("Class 2");super.class1Member();
    }
}
final class Class3 extends Class2 {
    public void class3Member() {
        System.out.println("Class 3");super.class2Member();
    }
}
// class Class4 extends Class3 {

// }

public class FinalClassDemo {
    public static void main(String[] args) {
        new Class3().class3Member();
    }
}
