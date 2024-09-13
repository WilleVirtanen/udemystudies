package day7;

import java.util.Scanner;

public class SerchingElementInArray {
    public static void main(String[] args) {

        int a[]={10,20,30,40,50,20};
        Scanner sc=new Scanner(System.in);

        System.out.println("Write a number to search for in the array");
        int searchnumber=sc.nextInt();
        boolean status=false;
        for(int i=0; i<=a.length-1; i++)
        {
            if(searchnumber==a[i])
            {
                System.out.println("Element found at slot: "+i);
                status=true;
            }            
        }
        if(status==false)
        {
            System.out.println("Element not found");
        }
        

        
    }

}
