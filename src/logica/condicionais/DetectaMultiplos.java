package logica.condicionais;

import java.util.Scanner;

public class DetectaMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        // MINHA SOLUCAO

        if (num2 > num1) {
            if (num2 % num1 == 0) {
                IO.println("Sao Multiplos");
            } else {
                IO.println("Nao sao Multiplos");
            }
        } else {
            if (num1 % num2 == 0) {
                IO.println("Sao Multiplos");
            } else {
                IO.println("Nao sao Multiplos");
            }
        }

        // SOLUCAO DA IA

        //        int maior = Math.max(num1, num2);
        //        int menor = Math.min(num1, num2);
        //
        //        if (maior % menor == 0) {
        //            IO.println("Sao Multiplos");
        //        } else {
        //            IO.println("Nao sao Multiplos");
        //        }

        sc.close();
    }
}
