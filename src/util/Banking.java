package util;

public class Banking {
    private int account;

    private String name;

    private double value;

    public static int TAX = 5;


    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String Updated() {
        return "Account: " + account + ", Holder:" + name + ", Balance : $" + value;
    }

    public void DepositValue(double value) {
        this.value = this.value + value;
    }

    public void WithdrawValue(double value) {
        this.value = (this.value - value) - TAX;
    }

}
