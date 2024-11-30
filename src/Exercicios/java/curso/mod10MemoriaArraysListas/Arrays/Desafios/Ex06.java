package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Input values: ");
        int quantity = read.nextInt();

        int[] arrayA = new int[quantity];
        int[] arrayB = new int[quantity];
        int[] arrayResultant = new int[quantity];

        System.out.println("Input numbers ot the A: ");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = read.nextInt();
        }

        System.out.println("Input numbers ot the B: ");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = read.nextInt();
        }

        System.out.println("Array resultant: ");
        for (int i = 0; i < arrayResultant.length; i++) {
            arrayResultant[i] = arrayA[i] + arrayB[i];
            System.out.println(arrayResultant[i]);
        }



        read.close();
    }
}
