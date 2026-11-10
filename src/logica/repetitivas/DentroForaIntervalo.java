package logica.repetitivas;

import java.util.Scanner;

public class DentroForaIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, totalIn = 0, totalOut = 0;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                totalIn++;
            } else {
                totalOut++;
            }
        }

        System.out.printf("%d in%n", totalIn);
        System.out.printf("%d out%n", totalOut);

        sc.close();
    }
}
