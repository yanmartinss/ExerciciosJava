package oo.alturas.application;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = Integer.parseInt(sc.nextLine().trim());

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Altura: ");
            alturas[i] = Double.parseDouble(sc.nextLine().trim());
        }

        double somaAlturas = 0;
        int menores16 = 0;

        for (int i = 0; i < n; i++) {
            somaAlturas += alturas[i];
            if (idades[i] < 16) {
                menores16++;
            }
        }

        IO.println("");
        System.out.printf("Altura média: %.2f%n", somaAlturas / n);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menores16 * 100.0 / n);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}