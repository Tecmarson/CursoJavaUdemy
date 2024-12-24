package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex08B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Input datas of the vector: ");
        int quantity = read.nextInt();
        System.out.println();

        double[] numbers = new double[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("input datas: ");
            numbers[i] = read.nextDouble();
        }

        double sumNumbers = 0;
        double resultNumbers = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumNumbers += numbers[i];
                count++;
            }
        }

        resultNumbers = sumNumbers / count;

        if (count == 0) {
            System.out.println();
            System.out.println("ANYTHING NUMBERS IS EVEN!");
        } else if(sumNumbers % 2 == 0){
            System.out.print("MEDIA OF EVEN: ");
            System.out.println(resultNumbers);
        }



        read.close();
    }
}
