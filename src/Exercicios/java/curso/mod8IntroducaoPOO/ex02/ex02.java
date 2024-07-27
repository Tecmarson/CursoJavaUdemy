package Exercicios.java.curso.mod8IntroducaoPOO.ex02;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Products product = new Products();

        System.out.println("Enter Product Data: ");
        System.out.println("Name: ");
        product.name = read.nextLine();

        System.out.println("Price: ");
        product.price = read.nextDouble();

        System.out.println("Quantity In Stock: ");
        product.quantity = read.nextInt();

        System.out.println(product);

        System.out.println("");
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = read.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated dates: ");
        System.out.println(product);

        System.out.println("");
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = read.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated dates:");
        System.out.println(product);

        read.close();
    }
}
