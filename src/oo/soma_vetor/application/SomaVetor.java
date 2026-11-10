package oo.soma_vetor.application;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double sum = 0;

        double[] vet = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
            sum += vet[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vet[i]);
        }

        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", sum / n);

        sc.close();
    }
}