package Exercicios.java.curso.modulo6;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Informe as coordenadas: ");
        var X = read.nextInt();
        var Y = read.nextInt();

        while (X != 0 && Y!= 0) {
            if (X > 0 && Y > 0) {
                System.out.println("(" + X + "," + Y + ")" + ": Quadrante 1");
                break;
            } else if (X < 0 && Y > 0) {
                System.out.println("(" + X + "," + Y + ")" + ": Quadrante 2");
                break;
            } else if (X < 0 && Y < 0) {
                System.out.println("(" + X + "," + Y + ")" + ": Quadrante 3");
                break;
            } else {
                System.out.println("(" + X + "," + Y + ")" + ": Quadrante 4");
                break;
            }
        }


        read.close();
    }
}
