package oo.negativos.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];
        int[] vetNegatives = new int[n];
        int countNeg = 0;

        for (int i = 0; i < n; i++) {
            IO.print("Digite um número: ");
            vet[i] = sc.nextInt();
            if (vet[i] < 0) {
                vetNegatives[countNeg] = vet[i];
                countNeg++;
            }
        }

        IO.println("NÚMEROS NEGATIVOS:");
        for (int j = 0; j < countNeg; j++) {
            System.out.printf("%d%n", vetNegatives[j]);
        }

        sc.close();
    }
}