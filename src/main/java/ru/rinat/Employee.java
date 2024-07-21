package ru.rinat;

public class Employee {
    private int ID;
    private String name;
    private double salary;

    Employee() {
        this.ID = 0;
        this.name = "";
        this.salary = 0;
    }

    Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getName() + " with a salary of " + Utils.formatNumber(getSalary()) + " tenge";
    }
}
