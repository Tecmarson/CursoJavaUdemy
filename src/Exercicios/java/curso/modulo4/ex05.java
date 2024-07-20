package Exercicios.java.curso.modulo4;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int codigo1, codigo2;
        int quantidade1, quantidade2;
        double valorFinal, valor1;

        System.out.println("Informe o código do produto: ");
        codigo1 = read.nextInt();

        System.out.println("Informe a quantidade: ");
        quantidade1 = read.nextInt();

        System.out.println("Informe o valor do produto: ");
        valor1 = read.nextDouble();

        System.out.println("Informe o código do produto: ");
        codigo2 = read.nextInt();

        System.out.println("Informe a quantidade: ");
        quantidade2 = read.nextInt();

        System.out.println("Informe o valor do produto: ");
        double valor2 = read.nextDouble();


        valor1 = quantidade1 * valor1;

        valor2 = quantidade2 * valor2;

        valorFinal = valor1 + valor2;


        System.out.printf("Valor a ser pago: %.2f", valorFinal);

        read.close();
    }
}
