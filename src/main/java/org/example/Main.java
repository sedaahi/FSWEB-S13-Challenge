package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runProject();
    }

    public static void runProject() {
        Healthplan healthplan = new Healthplan(
                1,
                "Workintech Health Plan",
                Plan.BASIC
        );

        Employee employee = new Employee(
                1,
                "Seda Ahi",
                "seda@gmail.com",
                "123456",
                new String[3]
        );

        Company company = new Company(
                1,
                "Workintech",
                500000,
                new String[3]
        );

        employee.addHealthPlan(0, "Basic Plan");
        employee.addHealthPlan(1, "Premium Plan");
        employee.addHealthPlan(1, "Standard Plan");
        employee.addHealthPlan(5, "Extra Plan");

        company.addEmployee(0, "Seda Ahi");
        company.addEmployee(1, "Ali Veli");
        company.addEmployee(1, "Ayşe Yılmaz");
        company.addEmployee(10, "Mehmet Demir");

        company.setGiro(-100);

        System.out.println(healthplan);
        System.out.println(employee);
        System.out.println(company);
    }
}