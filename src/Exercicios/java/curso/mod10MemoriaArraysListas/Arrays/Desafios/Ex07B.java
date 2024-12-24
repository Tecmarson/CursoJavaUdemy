package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Ex07B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Input datas of the vector: ");
        int quantity = read.nextInt();
        System.out.println();

        double[] numbers = new double[quantity];

        System.out.println("Input number: ");
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = read.nextDouble();
            sum += numbers[i];
        }

        double avgNumbers = sum / numbers.length;

        System.out.println();
        System.out.printf(String.format("AVERAGE VALUES: %.3f%n", avgNumbers));

        System.out.println("ELEMENTS LESS THAN AVERAGE: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < avgNumbers) {
                System.out.println(numbers[i]);
            }
        }


        read.close();
    }
}
