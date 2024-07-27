package Exercicios.java.curso.mod5EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double num, res;

        System.out.println("Informe um número inteiro: ");
        num = read.nextDouble();

        res = num / 2;

        if (res == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número impar!");
        }
    }
}
