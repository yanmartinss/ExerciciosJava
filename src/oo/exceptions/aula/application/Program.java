package oo.exceptions.aula.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            IO.println("Invalid position!");
        } catch (InputMismatchException e) {
            IO.println("Input error!");
        }

        IO.println("End of program");

        sc.close();
    }

}
