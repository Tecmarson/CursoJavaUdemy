package Exercicios.java.curso.mod9ContinuacaoPOO.ex01.entities;

public class Contaex01 {
    private String nameHolder;
    private int numberAccount;
    private double balance;
    private static final double TAX = 5;

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return this.balance;
    }

    public Contaex01(){}

    public Contaex01(String name, int numberAccount) {
        this.nameHolder = name;
        this.numberAccount = numberAccount;
        deposit(this.balance);
    }

    public Contaex01(String name, int numberAccount, double initialDeposit) {
        this.nameHolder = name;
        this.numberAccount = numberAccount;
        deposit(initialDeposit);
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withDraw) {
        this.balance -= withDraw + this.TAX;
    }

    @Override
    public String toString() {
        StringBuilder outputFormated = new StringBuilder();

        outputFormated.append(String.format("Account: %d ", getNumberAccount()));
        outputFormated.append(String.format(", Holder: %s ", getNameHolder()));
        outputFormated.append(String.format(", Balance: $ %.2f ", getBalance()));

        return outputFormated.toString();
    }
}
