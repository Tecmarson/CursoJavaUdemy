package Exercicios.java.curso.mod8IntroducaoPOO.ex04;

public class Employeeex01 {
    private String name;
    private double grossSalary;
    private double tax;
    private double percentage;

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public double increaseSalary() {
        double Increase =  this.netSalary() * (this.percentage / 100);
        return (this.grossSalary - this.tax) + Increase;
    }

    @Override
    public String toString() {
        StringBuilder outputFormated = new StringBuilder();

        outputFormated.append(String.format(" %s,%.2f%n", this.name, this.netSalary()));

        return outputFormated.toString();
    }
}
