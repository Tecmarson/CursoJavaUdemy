package Exercicios.java.curso.modulo8POO.ex03;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Retangleex01 retangle = new Retangleex01();

        System.out.println("Enter Rectangle Width and Height: ");
        retangle.setWidth(read.nextDouble());
        retangle.setHeight(read.nextDouble());

        System.out.println(retangle);

        read.close();
    }
}
