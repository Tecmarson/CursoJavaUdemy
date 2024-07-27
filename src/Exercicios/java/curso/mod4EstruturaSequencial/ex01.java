package Exercicios.java.curso.mod4EstruturaSequencial;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("Digite o primeiro número: ");
        num1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = in.nextInt();

        soma = num1 + num2;

        System.out.println("Números somados: " + num1 + " e " + num2);
        System.out.println("Resultado da soma: " + soma);
        in.close();
    }
}
