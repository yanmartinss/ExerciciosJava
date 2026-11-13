package oo.aulaabstrata.exercicio.application;

import oo.aulaabstrata.exercicio.entities.Company;
import oo.aulaabstrata.exercicio.entities.Individual;
import oo.aulaabstrata.exercicio.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        IO.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Tax payer #%d data:%n", i);
            IO.print("Indiviual or company (i/c)? ");
            String s = sc.next();
            IO.print("Name: ");
            String name = sc.next();
            IO.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (s.equals("i")) {
                IO.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (s.equals("c")) {
                IO.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        double sum = 0;
        IO.println("TAXES PAID:");
        for (TaxPayer taxPayer : list) {
            System.out.printf("%s: $ %.2f%n", taxPayer.getName(), taxPayer.tax());
            sum += taxPayer.tax();
        }

        IO.println("");
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);

        sc.close();
    }

}
