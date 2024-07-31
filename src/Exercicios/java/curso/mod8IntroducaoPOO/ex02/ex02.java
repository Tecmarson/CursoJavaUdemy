package Exercicios.java.curso.mod8IntroducaoPOO.ex02;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Enter Product Data: ");
        System.out.println("Name: ");
        String name = read.nextLine();

        System.out.println("Price: ");
        double price = read.nextDouble();

        Products product = new Products(name, price);

        System.out.println(product);

        System.out.println("");
        System.out.println("Enter the number of products to be added in stock: ");
        product.addProducts(read.nextInt());

        System.out.println();
        System.out.println("Updated dates: ");
        System.out.println(product);

        System.out.println("");
        System.out.println("Enter the number of products to be remove in stock: ");
        product.removeProducts(read.nextInt());

        System.out.println();
        System.out.println("Updated dates:");
        System.out.println(product);

        read.close();
    }
}
