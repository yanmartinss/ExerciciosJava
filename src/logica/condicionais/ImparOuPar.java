package logica.condicionais;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;

        num1 = sc.nextInt();

        IO.println(num1 % 2 == 0 ? "PAR" : "IMPAR");

        sc.close();
    }
}
