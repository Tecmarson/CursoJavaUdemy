package Exercicios.java.curso.modulo5;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double horaInicial, horaFinal, duracao;

        System.out.println("Informe a hora inicial e final da sua partida: ");
        horaInicial = read.nextDouble();
        horaFinal = read.nextDouble();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - (horaFinal + horaInicial);
        }

        System.out.printf("O jogo durou %s horas. %n", duracao);

        read.close();
    }
}
