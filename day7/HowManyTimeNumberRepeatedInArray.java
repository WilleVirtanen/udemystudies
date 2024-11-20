package day7;

import java.util.Scanner;

public class HowManyTimeNumberRepeatedInArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[]={10,20,30,10,50,10};
            boolean status=false;
            int numTimes=0;
            
            System.out.println("Enter the number you are looking for:");
            int searchnumber=sc.nextInt();
            /*for(int i=0;i<=a.length-1;i++)
            {
            if(searchnumber==a[i])
            {
            numTimes++;
            status=true;
            }
            }*/
            
            for(int value:a)
            {
                if(value==searchnumber)
                {
                    numTimes++;
                    status=true;
                }
            }
            
            if(status==true)
            {
                System.out.println("The number was found "+numTimes +" times");
            }
            else
            {
                System.out.println("Number was not found");
            }
        }
    }

}
