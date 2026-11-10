package logica.basico;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        double pi = 3.14159;
        double num1;

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextDouble();

        System.out.printf("A = %.4f%n", pi * (num1 * num1));
        sc.close();
    }
}
