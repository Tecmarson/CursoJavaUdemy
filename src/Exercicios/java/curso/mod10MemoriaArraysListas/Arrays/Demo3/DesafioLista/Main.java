package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Demo3.DesafioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("How many employee will be registered?: ");
        Integer quantityEmployee = read.nextInt();

        List<Employee> employees = new ArrayList<>();

        Integer order = 1;
        for (int i = 0; i < quantityEmployee; i++) {
            System.out.println("Employee " + order + "#");
            System.out.print("Id: ");
            Integer id = read.nextInt();

            while (hasId(employees, id)) {
                System.out.println("Id already taken! Try again.");
            }

            read.nextLine();
            System.out.print("Name: ");
            String name = read.nextLine();
            System.out.print("Salary: ");
            Double salary = read.nextDouble();

            Employee employee = new Employee(id, name, salary);

            employees.add(employee);
            order++;

            System.out.println();
        }

        System.out.println();
        System.out.print("Enter the employee id that will have encrease salary: ");
        Integer idSalary = read.nextInt();

        Employee employee = employees.stream().filter(emp -> emp.getId() == idSalary).findFirst().orElse(null);

        if (employee == null) {
            System.out.println("This id doesn't exist! Try again.");
        } else {
            System.out.print("Enter the pencentage: ");
            Double percent = read.nextDouble();
            employee.encreaseSalary(percent);
        }

        System.out.println();
        System.out.println("Employee list: ");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        read.close();
    }

    public static  boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
