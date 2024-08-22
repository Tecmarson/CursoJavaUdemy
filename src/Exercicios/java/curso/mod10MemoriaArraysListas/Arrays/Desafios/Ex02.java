package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Quanto números você quer ler?: ");
        int quantity = read.nextInt();

        double[] numbers = new double[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = read.nextInt();
        }

        System.out.print("Valores = ");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(" " + numbers[i] + " ");
        }


        System.out.println();
        System.out.print("Soma = ");
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.print(sum);


        System.out.println();
        System.out.print("Média = ");
        double media = 0;
        for (int i = 0; i < numbers.length; i++) {
            media += numbers[i] / numbers.length;
        }
        System.out.println(media);

        read.close();
    }
}
