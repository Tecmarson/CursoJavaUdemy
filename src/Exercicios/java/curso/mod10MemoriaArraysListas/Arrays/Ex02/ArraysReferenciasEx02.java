package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Ex02;

import Exercicios.java.curso.mod8IntroducaoPOO.ex02.Products;

import java.util.Locale;
import java.util.Scanner;

public class ArraysReferenciasEx02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Informe a quantidade, nome e o preço do produto: ");
        int quantity = read.nextInt();

        ArraysProductEx02[] vector = new ArraysProductEx02[quantity];

        for(int i = 0; i < vector.length; i++) {
            System.out.println("Informe nome e preço do produto: ");
            String name =read.nextLine();
            read.nextLine();
            double price = read.nextDouble();
            vector[i] = new ArraysProductEx02(name, price);
        }

        double sum = 0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double res = sum / vector.length;

        System.out.println(res);
    }
}
