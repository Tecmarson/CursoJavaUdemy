package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex05B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("INPUT: ");
        int quantity = read.nextInt();
        System.out.println();

        int[] numbers = new int[quantity];

        int numberPosition = 0;
        int greaterNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input number: ");
            numbers[i] = read.nextInt();
            if (numbers[i] > greaterNumber) {
                greaterNumber = numbers[i];
                numberPosition = i;
            }
        }

        System.out.println("Greater value: ");
        System.out.print(greaterNumber);
        System.out.println();
        System.out.println("Position: ");
        System.out.print(numberPosition);

        read.close();
    }
}
