package oo.bank.entities;

public class Account {
    public static final double TAX = 5.00;

    private int accountNumber;
    private String accountName;
    private double balance;

    public Account(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public Account(int accountNumber, String accountName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return  "Account: " + accountNumber +
                ", Holder: " + accountName +
                ", Balance: $ " + String.format("%.2f", balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double withdraw) {
        balance -= withdraw + TAX;
    }
}
