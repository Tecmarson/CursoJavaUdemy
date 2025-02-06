package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios.Entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Ex10B {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("How much student do you want for analysis? ");
        int quantityStudent = read.nextInt();
        read.nextLine();

        People[] students = new People[quantityStudent];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Input data of " + (i+1) + "ª student");
            System.out.println("Name: ");
            String name = read.nextLine();
            System.out.println("First note: ");
            Double firstNote = read.nextDouble();
            System.out.println("Second note: ");
            Double secondNote = read.nextDouble();
            read.nextLine();

            students[i] = new People(name, firstNote, secondNote);
        }

        System.out.println("APROVED STUDENTS: ");
        for (People peopleNote: students) {
            if ((peopleNote.getFirstNote() + peopleNote.getSecondNote()) / 2 >= 6) {
                System.out.println(peopleNote.getName());
            }
        }


        read.close();
    }
}
