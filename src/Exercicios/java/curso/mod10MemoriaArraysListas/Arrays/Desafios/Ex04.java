package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Quantos números você quer armazenar?");
        int quantityNumber = read.nextInt();

        int[] numbers = new int[quantityNumber];

        for (int i = 0; i < quantityNumber; i++) {
            System.out.println("Digite um número inteiro: ");
            numbers[i] = read.nextInt();
        }

        System.out.println("Números pares:");

        int numberEven = 0;
        for (int i = 0; i < quantityNumber; i++) {
            if (numbers[i] % 2 == 0 ) {
                numberEven++;
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Quantidade de número pares: " + numberEven);

        read.close();
    }
}
