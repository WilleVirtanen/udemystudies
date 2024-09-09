package Day3;

public class IncrimentOperator {

    public static void main(String[] args) 
    {
       
        int a=10;
        
        
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        System.out.println();

        //post increment 
        //int res=a++;
        //System.out.println(res);
        
        //post increment works on its own but not in a function

       //pre increment 
        //int res=++a;
        //System.out.println(res);

        int res=--a;
        System.out.println(res);

    }

}
