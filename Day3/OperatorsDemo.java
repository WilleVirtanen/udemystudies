package Day3;

public class OperatorsDemo 
{
public static void main(String[] args) 
{
    //1 arithmetic operators + - * / %

    int a=20, b=10;

    System.out.println("sum of a and b is: " +(a+b));
    System.out.println("diff of a and b is: " +(a-b));
    System.out.println("mul of a and b is: " +(a*b));
    System.out.println("div of a and b is: " +(a/b));
    System.out.println("modulo div of a and b is: " +(a%b));

    //Relationa/comparison operators > >= < <= != ==
    // returns boolean value - ture or false

    //b=20;

    System.out.println("is a bigger then b: " +(a>b));
    System.out.println("is a the same size or bigger then b: " +(a>=b));
    System.out.println("is b bigger then a: " +(a<b));
    System.out.println("is b the same size or bigger then a: " +(a<=b));
    System.out.println("is a and b the same: " +(a==b));
    System.out.println("is a not the same as b: " +(a!=b));

    //Logical operators && || !
    //returns boolean value - ture/false
    // works between 2 boolean values

    boolean x=true;
    boolean y=false;
    int g=10;
    
    System.out.println(x && y); //false
    System.out.println(x || y); //true
    System.out.println(!x); //false
    System.out.println(!y); //true

    System.out.println();

    boolean b1=10>20;
    System.out.println(b1);
    boolean b2=20>10;
    System.out.println(b2);

    System.out.println(b1 && b2);
    System.out.println(b1 || b2);

    System.out.println();

    System.out.println((10<20) && (20>10));
    System.out.println((g<20) || (g<30));

    System.out.println();

    System.out.println(!(10<20));


}
}
