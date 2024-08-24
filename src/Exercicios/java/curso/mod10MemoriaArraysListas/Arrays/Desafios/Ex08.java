package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Quantos elementos você quer armazenar? ");
        int quantity = read.nextInt();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite um número: ");
            numbers[i] = read.nextInt();
        }

        double sumNumbers = 0;
        int numEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumNumbers += numbers[i];
                numEven++;
            }
        }

        double media = sumNumbers / numEven;

        if (numEven == 0) {
            System.out.println("Não há nenhum número par!");
        } else {
            System.out.println("Média dos pares: ");
            System.out.println(media);
        }


        read.close();
    }
}
