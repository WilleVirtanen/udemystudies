package day11;

public class Greetings {
    
    //No parameters No return value
    void m1()
    {
        System.out.println("Hello...");
    }

    //No parameters Return vale
    String m2()
    {
        return("Hello how are you?");
    }
    //takes parameters no return value
    void m3(String name)
    {
        System.out.println("Hello "+name);
    }
    //takes parameters returnes value
    String m4(String name)
    {
        return("Hello " +name);
    }

}
