package Day6;

import java.util.Arrays;

public class singleDimentionalArray {
    public static void main(String[] args) {
        //Declaring array

        //Approch 1: declaration
        int a[]=new int[5];

        //Adding values
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        //Approch 2: declaration and assigning

        int b[]= {10,20,30,40,50,60};
        
        //finding length of array

        System.out.println("the size of array a is: "+a.length);
        System.out.println("the size of array b is: "+b.length);

        //Read a single value
        System.out.println(a[2]);

        //Read multiple values
        System.out.println(Arrays.toString(a));
        
        for(int i=0;i<a.length; i++)
        {
            System.out.println(a[i]);
        }

        //Enhanced for loop/ for... each loop

        for(int x:a)
        {
            System.out.println(x);
        }



    }

}
