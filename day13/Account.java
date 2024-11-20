package day13;

public class Account {

    //source generate getter and setter
    private int accno;
    private String name;
    private double amount;
    //getter
    public int getAccno() {
        return accno;
    }
    //setter
    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
