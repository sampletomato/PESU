import java.util.Scanner;

class Student {
    private String name, srn;
    private int[] marks = new int[3];
    private float avg; private char grade;
    // Getters
    public String getName() {return name;}
    public String getSrn() {return srn;}
    public int[] getMarks() {return marks;}
    public float getAvg() {return avg;}
    public char getGrade() {return grade;}
    // Setters
    public void setName(String name) {this.name = name;}
    public void setSrn(String srn) {this.srn = srn;}
    public void setMarks(int[] marks) {this.marks = marks;}
    public void setAvg() {
        int t = 0;
        for(int m: marks) t += m;
        avg = t/3.0f;
    } // Based on marks array
    public void setGrade() {
        if(avg >= 80) grade = 'A';
        else if(avg >= 60) grade = 'B';
        else grade = 'C';
    } // Based on float avg
    // Constructor
    Student(String name, String srn, int[] marks) {
        this.setName(name); this.setSrn(srn); this.setMarks(marks);
    }
}

public class StudentClassGettersSetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String srn = sc.nextLine();
        int[] marks = new int[3];
        for(int i = 0; i < marks.length; i++)
            marks[i] = sc.nextInt();
        Student s1 = new Student(name, srn, marks);
        s1.setAvg(); s1.setGrade();
        System.out.println(s1.getName());
        System.out.println(s1.getSrn());
        for(int m: s1.getMarks())
            System.out.println(m);
        System.out.println(s1.getAvg());
        System.out.println(s1.getGrade());
    }   
}
