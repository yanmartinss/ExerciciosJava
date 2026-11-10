package logica.condicionais;

import java.util.Scanner;

public class CalculaIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;

        num = sc.nextDouble();

        if (num >= 0 && num <= 25) {
            IO.println("Intervalo [0,25]");
        } else if (num > 25 && num <= 50) {
            IO.println("Intervalo [25,50]");
        } else if (num > 50 && num <= 75) {
            IO.println("Intervalo [50,75]");
        } else if (num > 75 && num <= 100) {
            IO.println("Intervalo [75,100]");
        } else {
            IO.println("Fora do intervalo");
        }

        sc.close();
    }
}
