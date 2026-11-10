package logica.repetitivas;

import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPassword = 2002;
        int typedPassword;

        typedPassword = sc.nextInt();

        while (typedPassword != correctPassword) {
            IO.println("Senha Inválida");
            typedPassword = sc.nextInt();
        }

        IO.println("Acesso Permitido");

        sc.close();
    }
}
