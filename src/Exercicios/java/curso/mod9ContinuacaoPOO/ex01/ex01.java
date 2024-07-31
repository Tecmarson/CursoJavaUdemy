package Exercicios.java.curso.mod9ContinuacaoPOO.ex01;

import Exercicios.java.curso.mod9ContinuacaoPOO.ex01.entities.Accountex01;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        Accountex01 account;

        System.out.println("Enter account number: ");
        int numberAccount = read.nextInt();

        read.nextLine();

        System.out.println("Enter account holder: ");
        String accountName = read.nextLine();

        System.out.println("Is there an initial deposit (y/n)?:");
        String choiceDeposit = read.nextLine();

        if (choiceDeposit.contains("y")) {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = read.nextDouble();
            account = new Accountex01(accountName, numberAccount, initialDeposit);
            System.out.println(account);

            System.out.println("Enter a deposit value: ");
            account.deposit(read.nextDouble());

            System.out.println("Update data:");
            System.out.println(account);

            System.out.println("Enter a withdraw value: ");
            account.withdraw(read.nextDouble());

            System.out.println("Update data:");
            System.out.println(account);
        } else if (choiceDeposit.contains("n")) {
            account = new Accountex01(accountName, numberAccount);
            System.out.println(account);

            System.out.println("Enter a deposit value: ");
            account.deposit(read.nextDouble());

            System.out.println("Update data:");
            System.out.println(account);

            System.out.println("Enter a withdraw value: ");
            account.withdraw(read.nextDouble());

            System.out.println("Update data:");
            System.out.println(account);
        } else {
            System.out.println("Tente novamente e digite y para sim e n para não.");
        }

        System.out.println("Volte sempre!");

        read.close();
    }
}
