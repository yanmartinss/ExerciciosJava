package oo.bank.application;

import oo.bank.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;

        IO.print("Enter the account number: ");
        int accountNumber = sc.nextInt();

        IO.print("Enter account holder: ");
        String accountName = sc.next();

        IO.print("Is there na initial deposit (y/n)? ");
        String haveInitialDeposit = sc.next();

        if ("y".equalsIgnoreCase(haveInitialDeposit)) {
            IO.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountName, initialDeposit);
        } else {
            account = new Account(accountNumber, accountName);
        }

        IO.println("Account data:");
        System.out.println(account);

        IO.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);

        IO.println("Updated account data:");
        System.out.println(account);

        IO.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        IO.println("Updated account data:");
        System.out.println(account);


        sc.close();
    }
}
