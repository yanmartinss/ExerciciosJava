package oo.numeros_pares.application;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int qntPares = 0;

        for (int i = 0; i < n; i++) {
            IO.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        IO.println("NÚMEROS PARES:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf("%d ", numeros[i]);
                qntPares++;
            }
        }

        IO.println("");
        System.out.printf("QUANTIDADE DE PARES = %d%n", qntPares);

        sc.close();
    }
}
