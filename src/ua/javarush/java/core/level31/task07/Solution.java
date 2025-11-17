package ua.javarush.java.core.level31.task07;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        // Наповнюємо список працівників — кілька відділів і різні посади
        List<Employee> employees = List.of(
                new Employee("Alice", "IT", "Developer", 120_000),
                new Employee("Bob", "HR", "Recruiter", 80_000),
                new Employee("Clara", "IT", "Manager", 150_000),
                new Employee("David", "IT", "Developer", 110_000),
                new Employee("Eve", "Sales", "Sales Representative", 90_000),
                new Employee("Frank", "HR", "Manager", 130_000),
                new Employee("Grace", "Finance", "Accountant", 100_000),
                new Employee("Heidi", "IT", "QA Engineer", 95_000),
                new Employee("Ivan", "Sales", "Manager", 140_000),
                new Employee("Judy", "Marketing", "Analyst", 85_000),
                new Employee("Kevin", "Marketing", "Manager", 125_000),
                new Employee("Laura", "Finance", "Analyst", 105_000),
                new Employee("Mallory", "IT", "Developer", 118_000),
                new Employee("Niaj", "Sales", "Sales Representative", 88_000),
                new Employee("Olivia", "HR", "Recruiter", 82_000)
        );

        // Вкладене групування Stream API:
        // 1) groupingBy за відділом
        // 2) усередині відділу — groupingBy за посадою
        // 3) замість об’єктів Employee — збираємо лише імена (mapping -> List<String>)
        Map<String, Map<String, List<String>>> structure =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartmentName,
                                LinkedHashMap::new, // щоб зберегти передбачуваний порядок під час виводу
                                Collectors.groupingBy(
                                        Employee::getPositionTitle,
                                        LinkedHashMap::new,
                                        Collectors.mapping(Employee::getEmployeeName, Collectors.toList())
                                )
                        ));

        // Гарний вивід результату у читабельному вигляді
        System.out.println("Організаційна структура (відділ -> посада -> імена):");
        structure.forEach((department, byPosition) -> {
            System.out.println("- " + department);
            byPosition.forEach((position, names) -> {
                System.out.println("    " + position + ": " + String.join(", ", names));
            });
        });
    }
}

// Модель працівника: ім’я, відділ, посада, зарплата
class Employee {
    private final String employeeName;
    private final String departmentName;
    private final String positionTitle;
    private final int salary;

    public Employee(String employeeName, String departmentName, String positionTitle, int salary) {
        this.employeeName = employeeName;
        this.departmentName = departmentName;
        this.positionTitle = positionTitle;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public int getSalary() {
        return salary;
    }
}