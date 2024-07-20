package Exercicios.java.curso.modulo4;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double num1, num2, num3, num4, diferenca, resultado;

        System.out.println("Digite um número: ");
        num1 = read.nextDouble();

        System.out.println("Digite um número: ");
        num2 = read.nextDouble();

        System.out.println("Digite um número: ");
        num3 = read.nextDouble();

        System.out.println("Digite um número: ");
        num4 = read.nextDouble();

        diferenca = (num1 * num2) - (num3 * num4);

        System.out.printf("A diferença entre os produtos de %.2f * %.2f e %.2f * %.2f é %.2f", num1, num2, num3, num4, diferenca);

        read.close();
    }
}
