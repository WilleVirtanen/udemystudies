package Day5;

public class skoluppgift {
    public static void main(String[] args) 
    {
        int numb=1;
        int x=1;
        int size=9;
        
        while(numb<=size)
        {
            while(x<=numb)
            {
            System.out.print(numb);
            x++;
            }
            System.out.println();
            x=1;
            numb++;
        }
        numb=numb-1;
        size=1;
        while(numb>=size)
        {
            numb--;
            while(numb>=x)
            {
            System.out.print(numb);
            x++;
            }
            x=1;
            System.out.println();
                        
        }
    }
}
