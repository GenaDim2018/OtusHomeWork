package ru.otus.homework15;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMethods {
    public static List<Employee> createEmployeeList() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Олег", 40));
        list.add(new Employee("Вадим", 35));
        list.add(new Employee("Павел", 20));
        list.add(new Employee("Наталья", 30));
        list.add(new Employee("Анастасия", 25));
        return list;
    }

    public static List<String> listOfNames(List<Employee> list) {
        List<String> names = new ArrayList<>();
        for (Employee employee : list) {
            names.add(employee.getName());
        }
        return names;
    }

    public static List<Employee> employeesElderThanInt(List<Employee> list, int minAge) {
        List<Employee> employees = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() >= minAge) employees.add(employee);
        }
        return employees;
    }

    public static boolean checkAverageAge(List<Employee> list, int minAge) {
        int summaryAge = 0;
        for (Employee employee : list) {
            summaryAge += employee.getAge();
        }
        if ((int) summaryAge / list.size() > minAge) return true;
        return false;
    }

    public static Employee findYoungest(List<Employee> list) {
        Employee youngest = list.get(0);
        for (Employee employee : list) {
            if (youngest.getAge() > employee.getAge()) youngest = employee;
        }
        return youngest;
    }
    public static void run(){
        List <Employee> list = createEmployeeList();
        System.out.println(list);
        System.out.println("1)");
        System.out.println(listOfNames(list));
        System.out.println("2)");
        System.out.println(employeesElderThanInt(list, 30));
        System.out.println("3)");
        System.out.println("20: "+ checkAverageAge(list, 20));
        System.out.println("37: " + checkAverageAge(list, 37));
        System.out.println("4)");
        System.out.println(findYoungest(list));
    }
}
