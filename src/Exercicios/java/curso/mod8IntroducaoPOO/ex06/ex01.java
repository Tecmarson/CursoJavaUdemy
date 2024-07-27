package Exercicios.java.curso.mod8IntroducaoPOO.ex06;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double price = read.nextDouble();
        System.out.println("How many dollars you will be bought?");
        double paid = read.nextDouble();

        double converter = CurrencyConverter.CoinConverter(paid, price);

        System.out.printf("Amount to be paid in reais: %.2f", converter);

        read.close();
    }
}
