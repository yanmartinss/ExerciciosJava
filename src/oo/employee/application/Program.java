package oo.employee.application;

import oo.employee.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        IO.print("Name: ");
        employee.name = sc.nextLine();
        IO.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        IO.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());

        IO.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        sc.close();
    }
}
