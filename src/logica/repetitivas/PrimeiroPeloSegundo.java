package logica.repetitivas;

import java.util.Scanner;

public class PrimeiroPeloSegundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numerador, denominador;
        double total;

        for (int i = 0; i < n; i++) {
            numerador = sc.nextInt();
            denominador = sc.nextInt();
            if (denominador == 0) {
                IO.println("divisao impossivel");
            } else {
                total = (double) numerador / denominador;
                System.out.printf("%.1f%n", total);
            }
        }

        sc.close();
    }
}
