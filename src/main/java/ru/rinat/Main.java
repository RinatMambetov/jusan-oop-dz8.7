package ru.rinat;

public class Main {
    public static void main(String[] args) {
        Employee sanzhar = new Employee(1, "Sanzhar", 500000);
        Employee aidana = new Employee(2, "Aidana", 1000000);
        Employee bekzhan = new Employee(3, "Bekzhan", 2200000);
        Department hornsAndHoofs = new Department("Horns and Hoofs");
        hornsAndHoofs.addEmployee(sanzhar);
        hornsAndHoofs.addEmployee(aidana);
        hornsAndHoofs.addEmployee(bekzhan);
        System.out.println(hornsAndHoofs);
        Employee[] employees = hornsAndHoofs.getEmployees();
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }
}