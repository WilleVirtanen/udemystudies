package Day5;

public class Forloopdemo 
{
     public static void main(String[] args) 
     {
        
        for(int i=1; i<=10; ++i)
        {
            System.out.println(i);
        }

        for(int l=2; l<=10; l+=2)
        {
            System.out.println(l);
        }

        for(int j=1; j<=10; j++)
        {
            if(j%2==0)
            {System.out.println(j);}
        }
        for(int k=10; k>=1; k--)
        {
            System.out.println(k);
        }

    }

}
