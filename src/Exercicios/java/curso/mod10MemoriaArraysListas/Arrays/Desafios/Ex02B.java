package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("How much numbers do you want storage? ");
        int quantity = read.nextInt();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input number: ");
            numbers[i] = read.nextInt();
        }

        double sum = 0;
        System.out.print("Valores = ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }
        System.out.println();

        double avg = sum / numbers.length;

        System.out.printf(String.format("Soma = %.2f%n", sum));
        System.out.printf(String.format("Avarage = %.2f%n", avg));

        read.close();
    }
}
