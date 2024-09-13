package day7;

import java.util.Scanner;

public class TakingMultipleInputs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1= sc.nextInt();
        System.out.println("Enter second number:");
        int num2= sc.nextInt();
        System.out.println("Sum of numbers is: "+(num1+num2));

        
    }

}
