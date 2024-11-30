package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("How many peoples do you want save in the system?");
        int quantity = read.nextInt();
        
        String[] names = new String[quantity];
        int[] ages = new int[quantity];
        double[] heights = new double[quantity];

        int order = 1;
        for (int i = 0; i < names.length; i++) {

            System.out.println("Input datas the " + order + "ª people: " );

            read.nextLine(); // Linha para consumir o buffer

            System.out.print("Name: ");
            names[i] = read.nextLine();

            System.out.print("Age: ");
            ages[i] = read.nextInt();

            System.out.print("Height: ");
            heights[i] = read.nextDouble();

            order++;
        }

        int minorAge = 0;
        double sumHeight = 0;

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 16) {
                minorAge++;
            }
            sumHeight += heights[i];
        }

        double everage = sumHeight / heights.length;

        int percentage = (int) (((double) minorAge / ages.length) * 100);

        System.out.print("Everage height: ");
        System.out.printf("%.2f%n", everage);

        System.out.print("People under 16 years old: ");
        System.out.println(String.format("%s", percentage) + "%");

        
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 16) {
                System.out.print(names[i] + " ");
            }
        }
        
        read.close();
    }
}
