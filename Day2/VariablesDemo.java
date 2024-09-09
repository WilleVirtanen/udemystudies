package Day2;

public class VariablesDemo 
{
    public static void main(String[] args) 
    {
        //variables are containers that can hold data
        //to represent data we need variables
       /* example 1
        int a; //declaration
        a=100; //assignment
        System.out.println(a); //100
        a=200;
        System.out.println(a); //200
        */

        /*example 2
        int a=100; //declaration+assignment
        System.out.println(a);
        a=200;
        System.out.println(a);
        */
        
        /*example 3 if all teh variables belong to the same data type
        int a,b,c; you can declare al´l at the same time
        a=100;
        b=200;
        c=300;
        */

        //example 4 in a single statemant we define multiple variables
        int a=100,b=200,c=300;
        
        System.out.println("the value of a is: "+a);
        System.out.println("the value of b is: "+b);
        System.out.println("the value of c is: "+c);
        System.out.println(a+b+c);
        System.out.println(a+" "+b+" "+c);

    }
}
