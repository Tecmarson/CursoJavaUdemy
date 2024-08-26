package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);


        System.out.println("Qual quantidade de alunos matriculados?: ");
        int quantity = read.nextInt();
        read.nextLine();

        String[] names = new String[quantity];
        double[] notes1 = new double[quantity];
        double[] notes2 = new double[quantity];

        int orderPeople = 1;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite os dados do " + orderPeople + "ª aluno(a): ");

            System.out.println("Nome: ");
            names[i] = read.nextLine();

            System.out.println("Nota 1: ");
            notes1[i] = read.nextDouble();

            System.out.println("Nota 2: ");
            notes2[i] = read.nextDouble();

            read.nextLine();
            orderPeople++;
        }

        double halfYear1 = notes1[0];
        double halfYear2 = notes2[0];
        double approved = 0;
        String alunoApproved = "";
        for (int i = 0; i < quantity; i++) {
            if (halfYear1 + halfYear2 / 2 >= 6) {
                approved = notes1[i] + notes2[i];
                alunoApproved = names[i];
            }
        }

        if (approved / 2 >= 6) {
            System.out.println("Alunos aprovados: ");
            System.out.println(alunoApproved);
            System.out.println(approved / quantity);
        } else System.out.println("Não há alunos aprovados!");


        read.close();
    }
}
