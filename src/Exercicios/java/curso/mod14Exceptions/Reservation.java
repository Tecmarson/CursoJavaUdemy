package Exercicios.java.curso.mod14Exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private int roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){}

    public Reservation(int roomNumber, Date checkin, Date checkout) throws DomainException {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
        DateValidator.checkoutValidador(checkin, checkout);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public Long duration(){
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();

        if(checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for udpdate must be future dates:");
        }

        if (!checkOut.after(checkIn)) {
            throw new DomainException("CheckOut date must be after chickIn date: ");
        }

        DateValidator.checkoutValidador(checkin, checkout);
        this.checkin = checkIn;
        this.checkout = checkOut;
    }

    @Override
    public String toString() {
        StringBuilder formated =  new StringBuilder();

        formated.append("Room: ");
        formated.append(getRoomNumber());
        formated.append(", check-in: ");
        formated.append(sdf.format(checkin));
        formated.append(", check-out: ");
        formated.append(sdf.format(checkout));
        formated.append(", ");
        formated.append(duration());
        formated.append(" nights");

        return formated.toString();
    }
}
