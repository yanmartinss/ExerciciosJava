package oo.dolar.application;

import oo.dolar.entities.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        IO.print("How many dollars will be bought? ");
        double dollarAmount = sc.nextDouble();

        double result = CurrencyConverter.convertToReais(dollarPrice, dollarAmount);

        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();
    }
}
