package Exercicios.java.curso.mod8IntroducaoPOO.ex05;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        Alunoex01 aluno = new  Alunoex01();

        System.out.println("Informe as notas do aluno: ");
        aluno.setNotaPrimeiroTrimeste(read.nextDouble());
        aluno.setNotaSegundoTrimeste(read.nextDouble());
        aluno.setNotaTerceiroTrimeste(read.nextDouble());

        System.out.printf(aluno.toString());

        read.close();
    }
}
