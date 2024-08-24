package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Informe quantos valores cada vetor terá? ");
        int quantity = read.nextInt();

        int[] numbersA = new int[quantity];
        int[] numbersB = new int[quantity];
        int[] numbersResultante = new int[quantity];

        System.out.println("Informe os números do vetor A: ");
        for (int i = 0; i < quantity; i++) {
            numbersA[i] = read.nextInt();
        }

        System.out.println("Informe os números do vetor B: ");
        for (int i = 0; i < quantity; i++) {
            numbersB[i] = read.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < quantity; i++) {
            numbersResultante[i] = numbersA[i] + numbersB[i];
            System.out.println(numbersResultante[i]);
        }

        read.close();
    }
}
