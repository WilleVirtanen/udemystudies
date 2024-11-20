package day15;

public class Animal {
String color="white";
void displayColor()
{
    System.out.println(color);
}
void eat()
{
    System.out.println("Eating....");
}
Animal()
{
    System.out.println("This is animal");
}
}
class Dog extends Animal
{
    String color="Black";
    @Override
    void displayColor()
    {
        System.out.println(super.color);
    }
    void eat()
    {
        super.eat();
    }

    Dog() 
    {
        super(); //invoke parent class constructor
        System.out.println("This is dog");
    }
    
}
