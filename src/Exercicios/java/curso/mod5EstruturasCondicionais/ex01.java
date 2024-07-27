package Exercicios.java.curso.mod5EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double num;

        System.out.println("Informe um número: ");
        num = read.nextDouble();

        if (num < 0) {
            System.out.println("Número negativo!");
        } else if(num > 0) {
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número neutro!");
        }

        read.close();
    }
}
