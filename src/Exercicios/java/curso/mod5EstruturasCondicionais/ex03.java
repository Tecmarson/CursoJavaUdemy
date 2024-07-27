package Exercicios.java.curso.mod5EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num1, num2, res;

        System.out.println("Digite dois números inteiros: ");
           num1 = read.nextInt();
           num2 = read.nextInt();

           if (num1 % num2 == 0 || num2 % num1 == 0) {
               System.out.println("São multiplos!");
           } else {
               System.out.println("Não são multiplos!");
           }

/*           if (num1 < num2) {
               res = num2 % num1;
               if (res == 0) {
                   System.out.println("São multiplos!");
               } else {
                   System.out.println("Não são multiplos!");
               }
           } else if (num2 < num1) {
               res = num1 % num2;
               if (res == 0) {
                   System.out.println("São multiplos!");
               } else {
                   System.out.println("Não são multiplos!");
               }
           }*/

        read.close();
    }
}
