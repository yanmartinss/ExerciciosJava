package composicao.application;

import composicao.entities.Department;
import composicao.entities.HourContract;
import composicao.entities.Worker;
import composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        IO.print("Enter department's name: ");
        String departmentName = sc.next();
        IO.println("Enter worker data: ");
        IO.print("Name: ");
        String workerName = sc.next();
        IO.print("Level: ");
        String workerLevel = sc.next();
        IO.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, new Department(departmentName), baseSalary, WorkerLevel.valueOf(workerLevel));

        IO.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter contract #%d data:%n", i);
            IO.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            IO.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            IO.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, hours, valuePerHour);
            worker.addContract(contract);
        }

        IO.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f%n", monthAndYear, worker.income(year, month));

        sc.close();
    }
}
