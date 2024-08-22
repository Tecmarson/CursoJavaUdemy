package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Demo2.Entities;

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
        StringBuilder outputFormated =  new StringBuilder();

        outputFormated.append(String.format("Name: %s", getName()));
        outputFormated.append(String.format("Price: %.2f", getPrice()));

        return outputFormated.toString();
    }
}
