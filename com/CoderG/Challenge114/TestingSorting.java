package com.CoderG.Challenge114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("CoderG", 10000),
                new Employee("Ram", 15000),
                new Employee("Shyam", 5000),
                new Employee("Geeta", 20000)
        );

        employees.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
