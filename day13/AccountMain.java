package day13;

public class AccountMain {

    public static void main(String[] args) {
        
        Account acc=new Account();

        acc.setAccno(10101);
        acc.setName("john");
        acc.setAmount(12552.535);

        System.out.println(acc.getAccno());
        System.out.println(acc.getName());
        System.out.println(acc.getAmount());
    }
}
