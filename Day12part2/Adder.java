package Day12part2;

public class Adder {
/*
4 rules for overloading methods
1. Metod name should be the same
2. Number of parameters should be diffrent
3. Data typ of parameters should be diffrent
4. Order of parameters should be different
 */
    int a=10, b=20;

    void sum()
    {
        System.out.println(a+b);
    }
    void sum(int x, int y)
    {
        System.out.println(x+y);
    }
    void sum(double x, double y)
    {
        System.out.println(x+y);
    }
    void sum(int x, double y)
    {
    System.out.println(x+y);
    }
    void sum(double y,int x)
    {
    System.out.println(x+y);
    }
    
}
