package Day14;

class A
{
    int a;
    void display()
    {
        System.out.println(a);
    }
}

class B extends A
{
    int b;
    void show()
    {
        System.out.println(b);
    }
}

class C extends B
{
    int c;
    void showC()
    {
        System.out.println(c);
    }
}

public class InheretanceType {
    public static void main(String[] args) {
        C bobj=new C();
        bobj.a=10;
        bobj.b=20;
        bobj.c=30;

        bobj.display();
        bobj.show();
        bobj.showC();
    }

}
