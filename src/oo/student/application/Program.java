package oo.student.application;

import oo.student.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalNote());
        System.out.println(student.studentResult());
        if (student.n1 + student.n2 + student.n3 < 60) {
            System.out.printf("MISSSING %.2f POINTS%n", student.missingPoints());
        }

        sc.close();
    }
}
