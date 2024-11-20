package day7;
    
import java.util.Scanner;

public class TakingInputFromUser {
public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        
        System.out.println("Give value of the number is: "+a);
        
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Your name is: " +name);
    }
}
}

