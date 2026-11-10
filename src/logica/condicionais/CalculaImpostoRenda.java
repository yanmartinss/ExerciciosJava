package logica.condicionais;

import java.util.Scanner;

public class CalculaImpostoRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            imposto = 0;
            if (salario > 2000.00) {
                imposto += (Math.min(salario, 3000.00) - 2000.00) * 0.08;
            }
            if (salario > 3000.00) {
                imposto += (Math.min(salario, 4500.00) - 3000.00) * 0.18;
            }
            if (salario > 4500.00) {
                imposto += (salario - 4500.00) * 0.28;
            }
            System.out.printf("R$ %.2f%n", imposto);
        }


        sc.close();
    }
}
