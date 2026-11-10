package oo.heranca.employee.application;

import oo.heranca.employee.entities.Employee;
import oo.heranca.employee.entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        IO.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d data:%n", i);
            IO.print("Outsourced (y/n)? ");
            String s = sc.next();
            IO.print("Name: ");
            String name = sc.next();
            IO.print("Hours: ");
            int hours = sc.nextInt();
            IO.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (s.equals("y") || s.equals("yes")) {
                IO.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                list.add(new OutsorcedEmployee(name, valuePerHour, hours, additionalCharge));
            } else {
                list.add(new Employee(name, valuePerHour, hours));
            }
        }

        IO.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.printf("%s $ %.2f%n", emp.getName(), emp.payment());
        }

        sc.close();

    }

}
