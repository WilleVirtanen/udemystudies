package day11;

public class StudentMain {
    public static void main(String[] args) {
        Student bob=new Student(102,"Lee",'A');
        bob.printStuData();
        bob.setStuData(101, "Bob", 'F');
        bob.printStuData();
    }

}
