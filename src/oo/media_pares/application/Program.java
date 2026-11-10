package oo.media_pares.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int qntPares = 0;
        int sumPares = 0;

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                sumPares += vetor[i];
                qntPares++;
            }
        }

        if (qntPares > 0) {
            System.out.printf("MEDIA DOS PARES = %.2f%n", (double) sumPares / qntPares);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}