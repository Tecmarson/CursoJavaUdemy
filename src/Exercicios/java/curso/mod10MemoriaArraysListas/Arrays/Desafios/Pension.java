package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Pension {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        Rent[] roomsForRent = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        Integer roomsQuantity = read.nextInt();
        read.nextLine();

        for (int i = 0; i < roomsQuantity; i++) {
            System.out.println();
            System.out.println("Rent #" + (i+1));
            System.out.println("What´s your name?");
            System.out.print("name: ");
            String name = read.nextLine();

            System.out.println("What´s your email?");
            System.out.print("email: ");
            String email = read.nextLine();

            System.out.println("Which room do you want?");
            System.out.print("room: ");
            Integer roomNumber = read.nextInt();

            roomsForRent[roomNumber] = new Rent(name, email);

            read.nextLine();

        }


        System.out.println("Busy rooms: ");
        for (int i = 0; i < roomsForRent.length; i++) {
            if (roomsForRent[i] != null) System.out.println(i + ": " + roomsForRent[i]);
        }

        read.close();
    }
}
