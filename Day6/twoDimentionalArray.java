package Day6;

public class twoDimentionalArray {
    public static void main(String[] args) {
        
        //Declaration
        //approuch 1
        int a[][]=new int[3][2];
       //adding values
       a[0][0]=150; 
       a[0][1]=250; 

       a[1][0]=350; 
       a[1][1]=450; 

       a[2][0]=550; 
       a[2][1]=650; 
       //approuch 2
       //Declaration + Adding values
       int b[][]={{100,200},{300,400},{500,600}};
   
       //Finding size of array
       System.out.println(a.length);
       System.out.println(a[0].length);
    
        //How to read a single value from array
        System.out.println(a[0][0]);
        //How to read all the data in a array
        for(int i=0;i<=b.length-1;i++)
        {
            for(int j=0;j<=b[i].length-1;j++)
            {
                System.out.println(b[i][j]);
            }
        }

        for(int i=0;i<=b.length-1;i++)
        {
            for(int j=0;j<=b[i].length-1;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        //Enhanced for loop
        for(int arr[]:a)
        {
            for(int x:arr)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    
    }

}
