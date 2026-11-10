package logica.repetitivas;

import java.util.Scanner;

public class CalculoPosto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod, totalAlcool = 0, totalGasolina = 0, totalDiesel = 0;

        cod = sc.nextInt();

        while (cod != 4) {
            if (cod == 1) {
                totalAlcool++;
            } else if (cod == 2) {
                totalGasolina++;
            } else if (cod == 3) {
                totalDiesel++;
            }
            cod = sc.nextInt();
        }

        IO.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", totalAlcool);
        System.out.printf("Gasolina: %d%n", totalGasolina);
        System.out.printf("Diesel: %d%n", totalDiesel);

        sc.close();
    }
}
