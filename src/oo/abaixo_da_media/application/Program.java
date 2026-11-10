package oo.abaixo_da_media.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma / n;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (double valor : vetor) {
            if (valor < media) {
                System.out.printf("%.1f%n", valor);
            }
        }

        sc.close();
    }
}