package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex05B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("How many numbers do you want?");
        int quantity = read.nextInt();

        double[] numbers = new double[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input number: ");
            numbers[i] = read.nextDouble();
        }

        double greaterNumber = numbers[0];
        int greaterPosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greaterNumber) {
                greaterNumber = numbers[i];
                greaterPosition = i;
            }
        }

        System.out.println(String.format("Greater Value: %.2f ", greaterNumber));
        System.out.println(String.format("Position: %s", greaterPosition));

        read.close();
    }
}
