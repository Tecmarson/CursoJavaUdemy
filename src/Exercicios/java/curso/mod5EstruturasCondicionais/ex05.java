package Exercicios.java.curso.mod5EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cod, quantidade;
        double preco1 = 4.00, preco2 = 4.50, preco3 = 5.00, preco4 = 2.00, preco5 = 1.50, total = 0;

        System.out.println("Informe o código do produto e a quantidade: ");
        cod = read.nextInt();
        quantidade = read.nextInt();

        if (cod == 1) {
            total = preco1 * quantidade;
        } else if (cod == 2) {
            total = preco2 * quantidade;
        } else if (cod == 3) {
            total = preco3 * quantidade;
        } else if (cod ==4) {
            total = preco4 * quantidade;
        } else if (cod ==5) {
            total = preco5 * quantidade;
        } else {
            System.out.println("Código inválido!");
        }


        System.out.printf("Total a pagar: R$ %.2f%n", total);

        read.close();
    }
}
