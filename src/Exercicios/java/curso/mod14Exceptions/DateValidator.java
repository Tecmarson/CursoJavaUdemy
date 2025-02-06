package Exercicios.java.curso.mod14Exceptions;

import java.util.Date;

public class DateValidator {

    public static void checkoutValidador(Date checkin, Date checkout) throws DomainException {
        if(!checkout.after(checkin)) {
            throw new DomainException("CheckOut must be after CheckIn date. ");
        }
    }
}
