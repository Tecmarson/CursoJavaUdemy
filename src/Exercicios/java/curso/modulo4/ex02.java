package Exercicios.java.curso.modulo4;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner in = new Scanner(System.in);

        double pi = 3.14;
        double raio;
        double areaDoCirculo;

        System.out.println("Digite o raio do círculo: ");
        raio = in.nextDouble();

        areaDoCirculo = (raio * raio) * pi;

        System.out.printf("Esse é o resultado do cálculo da área do círculo: %.4f", areaDoCirculo);

        in.close();
    }
}
