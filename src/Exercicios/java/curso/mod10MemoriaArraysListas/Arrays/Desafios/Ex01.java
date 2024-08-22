package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Quando números você quer ler?: ");
        int quantity = read.nextInt();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um números: ");
            numbers[i] = read.nextInt();
        }

        System.out.println("Números negativos");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) System.out.println(numbers[i]);
        }

        read.close();
    }
}
