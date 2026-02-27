class Student {
    // Data Members -- Name, SRN
    private String name, srn;
    Student(String name, String srn) {
        this.name = name; this.srn = srn;
        System.out.println("Constructor is called: " + this);
    }
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("SRN: " + srn);
    }
}
public class StudentClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student("S1", "SRN1"); // Object
        Student s2 = new Student("S2", "SRN2"); // Object
        s1.displayData();
        s2.displayData();
    }
}