package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios.Entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Ex03B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read  = new Scanner(System.in);

        System.out.print("How much peoples do you want storage: ");
        int quantityPeople = read.nextInt();

        People[] peoples = new People[quantityPeople];

        for (int i = 0; i < peoples.length; i++) {
            System.out.println("Datas the " + (i+1) +"ª people: ");

            read.nextLine();
            System.out.print("Name: ");
            String name = read.nextLine();

            System.out.print("Age: ");
            int age = read.nextInt();
            read.nextLine();

            System.out.print("Height: ");
            double height = read.nextDouble();

            peoples[i] = new People(name, age, height);

        }
        System.out.println();

        double sumHeight = 0;
        for (int i = 0; i < peoples.length; i++) {
            sumHeight += peoples[i].getHeight();
        }
        
        double minorAge = 0;
        for (int i = 0; i < peoples.length; i++) {
           if (peoples[i].getAge() < 16) {
               minorAge++;
           }
        }

        double percentAge = (minorAge / peoples.length * (100));
        double avgHeight = sumHeight / peoples.length;

        System.out.printf(String.format("AVG HEIGHT: %.2f%n", avgHeight));
        System.out.printf(String.format("PEOPLES LESS THAN 16 YEARS OLD: %.2f", percentAge));
        System.out.println("%");

        for (int i = 0; i < peoples.length; i++) {
            if(peoples[i].getAge() < 16) {
                System.out.println(peoples[i].getName());
            }
        }

        read.close();
    }
}
