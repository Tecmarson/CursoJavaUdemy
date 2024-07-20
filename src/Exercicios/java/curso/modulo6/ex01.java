package Exercicios.java.curso.modulo6;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Digite sua senha: ");
        var senha = read.nextInt();

        var senhaCorreta = 2002;

        while (senha != senhaCorreta) {
            if (senha != senhaCorreta) {
                System.out.println("Senha inválida!");
                System.out.println("Digite uma senha válida: ");
                senha = read.nextInt();
            }
        }

        System.out.println("Acesso concedido!");

        read.close();
    }

}
