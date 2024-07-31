package Exercicios.java.curso.mod8IntroducaoPOO.ex02;

public class Products {
    String name;
    double price;
    int quantity = 0;

    public Products() {}

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double totalValueInStock(){
        return  quantity * price;
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

        outputformated.append("Product Data: " + getName());
        outputformated.append(String.format(", $%.2f, ", getPrice()));
        outputformated.append(getQuantity() + " Units");
        outputformated.append(", Total: $" + totalValueInStock());

        return outputformated.toString();
    }
}
