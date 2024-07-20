package Exercicios.java.curso.modulo4;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String matricula;
        double horasTrabalhadas;
        double valorHora = 5.89;
        double salario;

        System.out.println("Informe sua matricula: ");
        matricula = read.next();

        System.out.println("Informe suas horas trabalhadas: ");
        horasTrabalhadas = read.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.printf("Funcionário %s vai receber de salário R$ %.2f", matricula, salario);


        read.close();
    }
}
