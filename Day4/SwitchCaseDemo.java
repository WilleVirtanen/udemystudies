package Day4;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int weeknr=8;

        switch(weeknr)
        {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Satursday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Invalid week day");
        }
    }

}
