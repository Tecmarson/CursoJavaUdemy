package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Informe quantas notas você quer salvar: ");
        int quantity = read.nextInt();

        double[] notas = new double[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite a nota: ");
            notas[i] = read.nextDouble();
        }

        System.out.println("Média das notas: ");

        double sumNotas = 0;

        for (int i = 0; i < quantity; i++) {
            sumNotas += notas[i];
        }

        double media = sumNotas / quantity;
        System.out.printf("%.3f%n", media);

        System.out.println("Notas abaixo da média: ");

        for (int i = 0; i < quantity; i++) {
            if (notas[i] < media) {
                System.out.println(notas[i]);
            }
        }

        read.close();
    }
}
