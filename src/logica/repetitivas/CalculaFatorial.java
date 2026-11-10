package logica.repetitivas;

import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 1;

        for (int i = n; i > 0; i--) {
            total *= i;
        }

        System.out.printf("%d%n", total);

        sc.close();
    }
}
