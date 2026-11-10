package logica.basico;

import java.util.Scanner;

public class CalculaTotal {
    public static void main(String[] args) {
        int codPecas1, qntPecas1, codPecas2, qntPecas2;
        double unitarioPecas1, unitarioPecas2, total;

        Scanner sc = new Scanner(System.in);

        codPecas1 = sc.nextInt();
        qntPecas1 = sc.nextInt();
        unitarioPecas1 = sc.nextDouble();
        sc.nextLine();
        codPecas2 = sc.nextInt();
        qntPecas2 = sc.nextInt();
        unitarioPecas2 = sc.nextDouble();

        total = (qntPecas1 * unitarioPecas1) + (qntPecas2 * unitarioPecas2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        sc.close();
    }
}
