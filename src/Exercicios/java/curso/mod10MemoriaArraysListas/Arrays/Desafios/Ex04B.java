package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex04B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("How much numbers do you want? ");
        System.out.println("Enter numbers: ");
        int quantity = read.nextInt();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input number: ");
            numbers[i] = read.nextInt();
        }

        System.out.println();
        System.out.println("Numbers even: ");
        int countNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                countNumber++;
            }
        }

        System.out.println();
        System.out.print("Quantity numbers even: ");
        System.out.println(countNumber);

        read.close();
    }
}
