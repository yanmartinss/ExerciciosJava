package oo.employee.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double totalSalary = netSalary() + (percentage / 100.0) * grossSalary;

        System.out.printf("Updated data: %s, $ %.2f%n", this.name, totalSalary);
    }
}
