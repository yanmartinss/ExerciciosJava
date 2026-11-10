package logica.repetitivas;

import java.util.Scanner;

public class MediaPonderado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double val1, val2, val3, total = 0;

        for (int i = 0; i <= n; i++) {
            val1 = sc.nextDouble();
            val2 = sc.nextDouble();
            val3 = sc.nextDouble();
            total = ((val1 * 2) + (val2 * 3) + (val3 * 5)) / 10;
            System.out.printf("%.1f%n", total);
        }

        sc.close();
    }
}
