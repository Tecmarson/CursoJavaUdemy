package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios.Entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Ex11B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Input peoples: ");
        int quantityPeople = read.nextInt();

        People[] peoples = new People[quantityPeople];

        for (int i = 0; i < peoples.length; i++) {
            System.out.println("Input data of the " + (i+1) + "ª people: ");
            System.out.print("Height: ");
            Double height = read.nextDouble();
            read.nextLine();
            System.out.print("Gender: ");
            String gender = read.nextLine();

            peoples[i] = new People(height, gender);
        }

        double sumHeightWomen = 0;
        int countWoman = 0;
        for (People woman: peoples) {
            if (woman.getGender().equals("W") && woman.getGender().equals("w")) {
                sumHeightWomen += woman.getHeight();
                countWoman++;
            }
        }

        double averageHeightWoman = sumHeightWomen / countWoman;

        double majorHeight = 0;
        for (People peopleHeight: peoples) {
            if (peopleHeight.getHeight() > majorHeight) {
                majorHeight = peopleHeight.getHeight();
            }
        }

        People minorHeight = null;
        for (int i = 0; i < peoples.length; i++) {
            minorHeight = peoples[0];
        }

        int countMen = 0;
        for (People men: peoples) {
            if (men.getGender().equals("M") &&  men.getGender().equals("m")) {
                countMen++;
            }
        }

        System.out.println("MINOR HEIGHT: %.2f%n"+ minorHeight);
        System.out.printf(String.format("MAJOR HEIGHT: %.2f%n", majorHeight));
        System.out.printf(String.format("AVERAGE HEIGHT´S WOMEN: %.2f%n", averageHeightWoman));
        System.out.println("QUANTITY´S MAN: " + countMen);

        read.close();
    }
}
