package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex06B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Input values of which vectors: ");
        int quantity = read.nextInt();

        int[] vectorA = new int[quantity];
        int[] vectorB = new int[quantity];
        int[] vectorC = new int[quantity];

        System.out.println("Input values vectorA");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Input values: ");
            vectorA[i] = read.nextInt();
        }
        System.out.println();

        System.out.println("Input values vectorB");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("Input values: ");
            vectorB[i] = read.nextInt();
        }
        System.out.println();

        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("Resultant vector: ");
        for (int i = 0; i < vectorC.length; i++) {
            System.out.println(vectorC[i]);
        }


        read.close();
    }
}
