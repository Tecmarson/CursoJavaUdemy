import Exercicios.java.curso.mod8IntroducaoPOO.ex02.Products;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Products p1 = new Products();
        Products p2 = new Products();

        p1 = p2;
        System.out.println();
        System.out.println(p1);

        read.close();
    }
}