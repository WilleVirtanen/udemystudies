package day10;

public class Employee {
    int eid;
    String ename;
    String job;
    int sal;

    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);

    }
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.eid=101;
        emp1.ename="Bob";
        emp1.job="Cleaner";
        emp1.sal=50000;
        emp1.display();

        Employee emp2=new Employee();
        emp2.eid=102;
        emp2.ename="Lee";
        emp2.job="Manager";
        emp2.sal=60000;
        emp2.display();

        Student stu=new Student();

        stu.sid=1010;
        stu.sname="Stu";
        stu.grad='A';

        stu.printStudentData();


    }


}
