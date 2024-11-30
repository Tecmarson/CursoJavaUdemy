package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("How many numbers do you want storage?");
        int size = read.nextInt();

        Double[] realNumbers = new Double[size];

        for (int i = 0; i < realNumbers.length; i++) {
            System.out.println("Input number: ");
            realNumbers[i] = read.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < realNumbers.length; i++) {
            sum += realNumbers[i];
        }

        double split = sum / realNumbers.length;

        System.out.print("Values: ");
        for (int i = 0; i < realNumbers.length; i++) {
            System.out.print(realNumbers[i]+ " ");
        }

        System.out.println();
        System.out.print("Sum: ");
        System.out.println(sum);

        System.out.print("Media: ");
        System.out.println(split);

        read.close();
    }
}
