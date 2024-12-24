package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios.Entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Ex09B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        
        System.out.println("How much people do you want input?");
        int quantity = read.nextInt();
        read.nextLine();

        People[] peoples = new People[quantity];

        for (int i = 0; i < peoples.length; i++) {
            System.out.println("Input data " + (i+1) + "ª people: ");
            System.out.print("Name: ");
            String name = read.nextLine();
            System.out.print("Age: ");
            Integer age = read.nextInt();
            read.nextLine();

            peoples[i] = new People(name, age);
        }

        Integer greaterAge = 0;
        for (People people: peoples) {
            if (people.getAge() > greaterAge) {
                greaterAge = people.getAge();
            }
        }

        for (People people: peoples) {
            if (people.getAge().equals(greaterAge)) {
                System.out.println();
                System.out.printf(String.format("Old people: %s, %s years old. %n", people.getName(), people.getAge()));
            }
        }

        read.close();
    }
}
