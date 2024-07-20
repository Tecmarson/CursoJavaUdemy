package Exercicios.java.curso.modulo4;

import java.util.Locale;
import java.util.Scanner;



public class ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double A, B, C, pi = 3.14159, Triangulo, Circulo, Trapezio, Quadrado, Retangulo;


        System.out.println("Digite o valor de A: ");
        A = read.nextDouble();

        System.out.println("Digite o valor de B: ");
        B = read.nextDouble();

        System.out.println("Digite o valor de C: ");
        C = read.nextDouble();

        Triangulo = (A * C) / 2;
        Circulo = pi * (C * C);
        Trapezio = ((A+B) * C) / 2;
        Quadrado = B * B;
        Retangulo = A * B;

        System.out.printf("Triângulo = %.3f %n", Triangulo);
        System.out.printf("Circulo = %.3f %n", Circulo);
        System.out.printf("Trapézio = %.3f %n", Trapezio);
        System.out.printf("Quadrado = %.3f %n", Quadrado);
        System.out.printf("Retângulo = %.3f %n", Retangulo);


        read.close();
    }
}
