package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("How many number do you want? ");
        int quantity = read.nextInt();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input number: ");
            numbers[i] = read.nextInt();
        }

        int sumNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumNumber += numbers[i];
            }
        }

        int average = sumNumber / numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Average even numbers: ");
                System.out.println(String.format("%s" , average));
            } else {
                System.out.println("Don´t exit even number!"); //logica errada
            }

            read.close();
        }
    }
}