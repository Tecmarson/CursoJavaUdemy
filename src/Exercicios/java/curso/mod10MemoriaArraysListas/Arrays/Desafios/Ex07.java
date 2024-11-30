package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("how many numbers do you want? ");
        int quantity = read.nextInt();

        double[] numbers = new double[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input number: ");
            numbers[i] = read.nextDouble();
        }

        double sumNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumNumber += numbers[i];
        }

        double average = sumNumber / numbers.length;

        System.out.println("Vector average: ");
        System.out.println(String.format("%.3f", average));

        System.out.println("Numbers under average: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average) {
                System.out.println(numbers[i]);
            }
        }

        read.close();
    }
}
