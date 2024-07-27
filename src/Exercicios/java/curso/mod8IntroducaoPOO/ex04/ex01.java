package Exercicios.java.curso.mod8IntroducaoPOO.ex04;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        Employeeex01 employee = new Employeeex01();

        System.out.println("Informe os dados do funcionário: ");
        employee.setName(read.nextLine());
        employee.setGrossSalary(read.nextDouble());
        employee.setTax(read.nextDouble());

        System.out.printf("Employee: %s, $%.2f%n", employee.getName(), employee.netSalary());
        System.out.println("");
        System.out.println("Which percentage to encrease salary: ");
        employee.setPercentage(read.nextDouble());
        System.out.println("");
        System.out.printf("Update data: %s, $%.2f%n", employee.getName(), employee.increaseSalary());

        read.close();
    }
}
