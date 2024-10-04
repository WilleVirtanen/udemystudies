package day13;

public class ThisKeyword {
    int x,y; //class varibles/instance varibles

    void setData(int x, int y)//local vaiables
    {
        this.x=x;//this as a keyword marks the variable as being a class variable
        this.y=y;
    }
    void display()
    {
        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        ThisKeyword th=new ThisKeyword();
        th.setData(10, 20);

        th.display();
    }

}
