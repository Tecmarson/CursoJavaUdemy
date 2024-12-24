package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex01B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("How much numbers do you want storage? ");
        int quantity = read.nextInt();
        read.nextLine();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input number: ");
            numbers[i] = read.nextInt();
        }

        System.out.println("Negative numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        read.close();
    }
}
