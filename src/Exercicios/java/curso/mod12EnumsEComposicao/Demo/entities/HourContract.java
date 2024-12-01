package Exercicios.java.curso.mod12EnumsEComposicao.Demo.entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {

    private LocalDate date;
    /*rivate Date date1;*/
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){}

    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    /*public Date getDate1() {
        return date1;
    }*/

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }
}
