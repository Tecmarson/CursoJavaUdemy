package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Demo1;

import java.util.Locale;
import java.util.Scanner;

public class ArraysPrimitivosEx01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o tamanho do Array: ");
        int tamanho = read.nextInt();

        double[] vetor = new double[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = read.nextDouble();
        }

        double soma = 0.0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i] / 2;
        }

        System.out.println(soma);
    }
}
