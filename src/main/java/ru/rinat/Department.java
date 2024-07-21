package ru.rinat;

public class Department {
    private final String name;
    private final Employee[] employees;
    private int lastAddedEmployeeIndex;

    Department(String name) {
        this.name = name;
        this.employees = new Employee[100];
        this.lastAddedEmployeeIndex = -1;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees[++lastAddedEmployeeIndex] = employee;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getEmployeeCount() {
        return lastAddedEmployeeIndex + 1;
    }

    public Employee getEmployeeByID(int empID) {
        for (Employee employee : employees) {
            if (employee != null && employee.getID() == empID) {
                return employee;
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        double totalSalary = getTotalSalary();
        return totalSalary / getEmployeeCount();
    }

    @Override
    public String toString() {
        return "Department {" +
                "name='" + name + '\'' +
                ", employeesCount=" + getEmployeeCount() +
                ", totalSalary=" + getTotalSalary() +
                ", averageSalary=" + String.format("%.2f", getAverageSalary()) +
                '}';
    }
}
