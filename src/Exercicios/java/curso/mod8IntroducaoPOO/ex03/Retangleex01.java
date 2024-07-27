package Exercicios.java.curso.mod8IntroducaoPOO.ex03;

public class Retangleex01 {
    private double width;
    private double height;


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
    }

    @Override
    public String toString() {
        StringBuilder outputFormated = new StringBuilder();

        outputFormated.append(String.format("Area: %.2f%n", this.area()));
        outputFormated.append(String.format("Perimeter: %.2f%n", this.perimeter()));
        outputFormated.append(String.format("Diagonal: %.2f%n", this.diagonal()));

        return outputFormated.toString();
    }
}
