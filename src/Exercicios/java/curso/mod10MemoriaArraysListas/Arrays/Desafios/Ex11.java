package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Quantos quer armazenar?: ");
        int quantity = read.nextInt();
        read.nextLine();

        String[] genders = new String[quantity];
        double[] heights = new double[quantity];

        int order = 1;
        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite os dados da "+ order +"ª pessoa: ");

            System.out.print("altura: ");
            heights[i] = read.nextDouble();

            read.nextLine();

            System.out.print("Genero: ");
            genders[i] = read.nextLine();

            order++;
        }

        double lowerHeight = heights[0];
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] <= lowerHeight) {
                lowerHeight = heights[i];
            }
        }

        double greaterHeight = heights[0];
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] >= greaterHeight) {
                greaterHeight = heights[i];
            }
        }

        int women = 0;
        int men = 0;
        double heightWomen = 0;
        for (int i = 0; i < genders.length; i++) {
            if (genders[i].contains("F") || genders[i].contains("f")) {
                heightWomen += heights[i];
                women++;
            }

            if (genders[i].contains("M") || genders[i].contains("m")) {
                men++;
            }
        }
        
        double mediaHeightWomen = heightWomen / women;


        System.out.println();
        System.out.printf("Menor altura: %.2f\n", lowerHeight);
        System.out.printf("Maior altura: %.2f\n", greaterHeight);
        System.out.printf("Média das alturas das mulheres: %.2f\n", mediaHeightWomen);
        System.out.println("Quantidade de homens na pesquisa: "+ men);


        read.close();
    }
}
