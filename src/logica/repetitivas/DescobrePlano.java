package logica.repetitivas;

import java.util.Scanner;

public class DescobrePlano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                IO.println("primeiro");
            } else if (x < 0 && y > 0) {
                IO.println("segundo");
            } else if (x < 0 && y < 0) {
                IO.println("terceiro");
            } else if (x > 0 && y < 0){
                IO.println("quarto");
            } else {
                break;
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
