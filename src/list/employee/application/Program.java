package list.employee.application;

import list.employee.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        IO.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d: %n", i + 1);
            IO.print("ID:  ");
            Integer id = sc.nextInt();
            IO.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            IO.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        IO.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);

        if (pos == null) {
            IO.println("This id does not exist!");
        } else {
            IO.print("Enter the percentage: ");
            double percetange = sc.nextDouble();
            list.get(pos).increaseSalary(percetange);
        }

        IO.println("List of employees:");
        for (Employee emp : list) {
            IO.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
