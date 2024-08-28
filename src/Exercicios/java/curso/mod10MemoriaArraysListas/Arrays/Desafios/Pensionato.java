package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        Rent[] rooms = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int roomsQuantity = read.nextInt();
        read.nextLine();

        for (int i = 0; i < roomsQuantity; i++) {
            System.out.println();
            System.out.print("Rent #" + (i+1) + "\n");
            System.out.println("What´s your name?");
            System.out.print("name: ");
            String name = read.nextLine();

            System.out.println("What´s your email?");
            System.out.print("email: ");
            String email = read.nextLine();

            System.out.println("Which room do you want?");
            System.out.print("room: ");
            int roomNumber = read.nextInt();

            rooms[roomNumber] = new Rent(name, email);

            read.nextLine();

        }


        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) System.out.println(i + ": " + rooms[i]);
        }

        read.close();
    }
}
