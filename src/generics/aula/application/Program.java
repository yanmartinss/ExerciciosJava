package generics.aula.application;

import generics.aula.services.entities.PrintService;

import java.util.Scanner;

public class Program {

    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        IO.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.print("First: " + x);

        sc.close();
    }

}
