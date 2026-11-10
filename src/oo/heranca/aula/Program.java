package oo.heranca.aula;

import oo.heranca.entities.Account;
import oo.heranca.entities.BusinessAccount;
import oo.heranca.entities.SavingsAccount;

public class Program {
    void main(String[] args) {

        Account x = new Account(1020, 1000.0, "Alex");
        Account y = new SavingsAccount(1023, 1000.0, "Maria", 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        IO.println(x.getBalance());
        IO.println(y.getBalance());

    }
}
