package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Ex02;

public class ArraysProductEx02 {
    private String name;
    private double price;

    public ArraysProductEx02(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ArraysProductEx02{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
