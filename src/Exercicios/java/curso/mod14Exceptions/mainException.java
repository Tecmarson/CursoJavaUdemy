package Exercicios.java.curso.mod14Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class mainException {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int roomNumber = read.nextInt();
            System.out.println("CheckIn data (dd/MM/yyyy): ");
            Date checkin = sdf.parse(read.next());
            System.out.println("CheckOut data (dd/MM/yyyy): ");
            Date checkout = sdf.parse(read.next());

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data for update the reservation:");
            System.out.println("CheckIn data (dd/MM/yyyy): ");
            checkin = sdf.parse(read.next());
            System.out.println("CheckOut data (dd/MM/yyyy): ");
            checkout = sdf.parse(read.next());

            reservation.updateDates(checkin, checkout);

            System.out.println("Reservation: " + reservation);

        } catch (ParseException e) {

            System.out.println("Invalide data format!");

        } catch (DomainException e) {

            System.out.println("Error in reservation: " + e.getMessage());

        }



        read.close();
    }
}
