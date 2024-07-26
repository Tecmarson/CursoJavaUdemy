package Exercicios.java.curso.modulo8POO.ex02;

public class Products {
    String name;
    double price;
    int quantity;


    public double totalValueInStock(){
        return this.quantity * this.price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        StringBuilder outputformated = new StringBuilder();

        outputformated.append("Product Data: " + this.name);
        outputformated.append(String.format(", $%.2f, ", this.price));
        outputformated.append( this.quantity + " Units");
        outputformated.append(", Total: $" + totalValueInStock());

        return outputformated.toString();
    }
}
