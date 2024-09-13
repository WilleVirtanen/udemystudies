package day7;

import java.util.Scanner;

public class NumberOfEvenAndOddNumbersInArray {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
    int countEven=0;
    int countOdd=0;

    for(int value:a)
    {
        if(value%2==0)
        {
            countEven++;
        }
        else
        {
            countOdd++;
        }
    }
    System.out.println("There are "+countEven+" even numbers and "+countOdd+" odd numbers");

    }

}
