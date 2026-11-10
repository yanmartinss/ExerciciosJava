package logica.basico;

import java.util.Scanner;

public class DiferencaProduto {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        sc.nextLine();
        num2 = sc.nextInt();
        sc.nextLine();
        num3 = sc.nextInt();
        sc.nextLine();
        num4 = sc.nextInt();

        System.out.printf("DIFERENCA = %d%n", (num1 * num2) - (num3 * num4));
        sc.close();
    }
}
