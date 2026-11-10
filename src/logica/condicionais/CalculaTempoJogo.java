package logica.condicionais;

import java.util.Scanner;

public class CalculaTempoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2) {
            int duracao = 24 - num1 + num2;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
        } else if (num1 == num2) {
            IO.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", num2 - num1);
        }

        sc.close();
    }
}
