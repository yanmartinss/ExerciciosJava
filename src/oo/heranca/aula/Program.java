package oo.heranca.aula;

import oo.heranca.entities.Account;
import oo.heranca.entities.BusinessAccount;
import oo.heranca.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    void main(String[] args) {

       List<Account> list = new ArrayList<>();

       list.add(new SavingsAccount(1001, 500.0, "Alex", 0.01));
       list.add(new BusinessAccount(1002, 1000.0, "Maria", 400.0));
       list.add(new SavingsAccount(1003, 300.0, "Bob", 0.01));
       list.add(new BusinessAccount(1005, 500.0, "Anna", 500.0));

        double sum = 0.0;

        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10);
        }

        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

    }
}
