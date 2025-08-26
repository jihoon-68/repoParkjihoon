package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example36;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String position;
    private String department;

    public Employee(String name, String position, String department) {
        this.name = name;
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }
    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + "(" + position + ", " + department + ")";
    }
}


public class MultiLevelGrouping {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee("Alice", "Manager", "HR"),
                new Employee("Bob", "Developer", "IT"),
                new Employee("Charlie", "Developer", "IT"),
                new Employee("David", "Manager", "Sales"),
                new Employee("Eve", "Developer", "Sales")
        );

        Map<String, Map<String,List<Employee>>> multiGroup =
                emps.stream().collect(
                        Collectors.groupingBy(
                        Employee::getPosition,
                        Collectors.groupingBy(Employee::getDepartment)
                ));
        System.out.println(multiGroup);
    }
}
