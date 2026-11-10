package logica.condicionais;

import java.util.Scanner;

public class DetectaNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;

        num1 = sc.nextInt();

        IO.println(num1 < 0 ? "NEGATIVO" : "NAO NEGATIVO");
        sc.close();
    }
}
