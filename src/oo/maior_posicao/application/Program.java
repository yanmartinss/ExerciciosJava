package oo.maior_posicao.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        int posMaior = 0;
        for (int i = 1; i < n; i++) {
            if (vet[i] > vet[posMaior]) {
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %d%n", vet[posMaior]);
        System.out.printf("POSIÇÃO = %d", posMaior + 1);

        sc.close();
    }
}