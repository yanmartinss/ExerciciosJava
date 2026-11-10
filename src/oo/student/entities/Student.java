package oo.student.entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double finalNote() {
        return n1 + n2 + n3;
    }

    public String studentResult() {
        return finalNote() >= 60 ? "PASS" : "FAILED";
    }

    public double missingPoints() {
        return Math.max(0, 60 - finalNote());
    }
}