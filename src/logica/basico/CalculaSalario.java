package logica.basico;

import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        int number;
        int workedHours;
        double wagePerHour;

        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();
        sc.nextLine();
        workedHours = sc.nextInt();
        sc.nextLine();
        wagePerHour = sc.nextDouble();

        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$ %.2f%n", workedHours * wagePerHour);
        sc.close();
    }
}
