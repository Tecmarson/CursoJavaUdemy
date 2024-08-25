package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja salvar na memoria?:");
        int quantity = read.nextInt();
        read.nextLine();

        String[] names = new String[quantity];
        int[] ages = new int[quantity];

        int orderPeople = 1;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite os dados da " + orderPeople + "ª pessoa: ");
            System.out.print("name: ");
            names[i] = read.nextLine();
            System.out.print("age: ");
            ages[i] = read.nextInt();
            read.nextLine();
            orderPeople++;
        }

        int agePeopleOld = ages[0];
        int positionName = 0;

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > agePeopleOld) {
                agePeopleOld = ages[i];
                positionName = i;
            }
        }

        System.out.println("A pessoa mais velha é " + names[positionName] + " com " + agePeopleOld + " anos.");


        read.close();
    }
}
