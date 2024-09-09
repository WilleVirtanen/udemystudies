package Day4;

public class Largesofthreenumbers {
public static void main(String[] args) {
    int numA=1, numB=10, numC=100;
    
    
    if(numA>numB && numA>numC)
    {
        System.out.println("A is biggest");
    }
    else if(numB>numA && numB>numC)
    {
        System.out.println("B is bigger");
    }
    else if(numC>numA && numC>numB)
    {
        System.out.println("C is bigger");          
    }
    else
    {
        System.out.println("Two or more of the numbers are the same");

    }
}
}
