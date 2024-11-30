package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("how many numbers do you want?");
        int quantity = read.nextInt();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input number: ");
            numbers[i] = read.nextInt();
        }

        System.out.println("Even numbers: ");
        int numberEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(String.format("%s ", numbers[i]));
                System.out.println();
                numberEven++;
            }
        }

        System.out.println(numberEven);


        read.close();
    }
}
