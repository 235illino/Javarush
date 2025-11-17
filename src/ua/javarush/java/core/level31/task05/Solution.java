package ua.javarush.java.core.level31.task05;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Створюємо список співробітників згідно з умовою задачі
        List<Employee> employees = List.of(
                new Employee("Alice", "IT"),
                new Employee("Bob", "HR"),
                new Employee("Clara", "IT"),
                new Employee("Denis", "Finance"),
                new Employee("Eva", "HR")
        );

        // Використовуємо Stream API та Collectors.groupingBy для групування за відділами.
        // У значення одразу збираємо лише імена співробітників (downstream-колектор mapping).
        // LinkedHashMap зберігає порядок відділів за першим появленням у початковому списку.
        var depart = employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentName));
        // Виводимо для кожного відділу список імен співробітників

        depart.forEach((dep, empls) -> System.out.println(dep + " : " + empls.stream().map(Employee::getEmployeeName).toList()));

    }
}

// Простий клас-сутність співробітника з двома полями та гетерами
class Employee {
    private final String employeeName;
    private final String departmentName;

    public Employee(String employeeName, String departmentName) {
        this.employeeName = employeeName;
        this.departmentName = departmentName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}