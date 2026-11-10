package logica.condicionais;

import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        double x, y;
        Scanner sc = new Scanner(System.in);

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0 && y > 0) {
            IO.println("Q1");
        } else if (x < 0 && y > 0) {
            IO.println("Q2");
        } else if (x < 0 && y < 0) {
            IO.println("Q3");
        } else if (x > 0 && y < 0) {
            IO.println("Q4");
        } else if (x == 0 && y != 0) {
            IO.println("Eixo X");
        } else if (y == 0 && x != 0) {
            IO.println("Eixo Y");
        } else {
            IO.println("Origem");
        }

        sc.close();
    }
}
