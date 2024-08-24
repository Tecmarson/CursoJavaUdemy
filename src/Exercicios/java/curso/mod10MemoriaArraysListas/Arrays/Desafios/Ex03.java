package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas?: ");
        System.out.println();
        int quantity = read.nextInt();


        String[] names = new String[quantity];
        int[] ages = new int[quantity];
        double[] heights = new double[quantity];


        for (int i = 0; i < quantity; i++) {
            read.nextLine();
            System.out.println("Digite o nome: ");
            names[i] = read.nextLine();

            System.out.println("Digite a idade: ");
            ages[i] = read.nextInt();

            System.out.println("Digite a altura: ");
            heights[i] = read.nextDouble();

            System.out.println(names[i]+ages[i]+heights[i]); //formatar a saida usando String.format
        }


        int minorAge = 0;
        double sumHeight = 0;

        for (int i = 0; i < quantity; i++) {
            if (ages[i] < 16) {
                minorAge++;
            }
            sumHeight += heights[i]; // -> sumHeight = sumHeight + heights[i]
        }

        double mediaHeight = sumHeight / quantity;
        double percentAge = ((double) minorAge / quantity) * 100;

        System.out.println("Altura média = " + String.format("%.2f", mediaHeight));
        System.out.println("A porcentagem de pessoas menores de 16 anos é de "+String.format("%.1f", percentAge)+"%");

        for (int i = 0; i < quantity; i++) {
            if (ages[i] < 16) {
                System.out.printf("%s", names[i]);
            }
        }

        read.close();
    }
}
