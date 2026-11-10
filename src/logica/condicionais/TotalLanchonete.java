package logica.condicionais;

import java.util.Scanner;

public class TotalLanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code, quantity;
        double total;

        code = sc.nextInt();
        quantity = sc.nextInt();

        if (code == 1) {
            System.out.printf("Total: R$ %.2f%n", (double) quantity * 4);
        } else if (code == 2) {
            System.out.printf("Total: R$ %.2f%n", (double) quantity * 4.5);
        } else if (code == 3) {
            System.out.printf("Total: R$ %.2f%n", (double) quantity * 5);
        } else if (code == 4) {
            System.out.printf("Total: R$ %.2f%n", (double) quantity * 2);
        } else if (code == 5) {
            System.out.printf("Total: R$ %.2f%n", (double) quantity * 1.5);
        } else {
            IO.println("Código inválido");
        }

        sc.close();
    }
}
