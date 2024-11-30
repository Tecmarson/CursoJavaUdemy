package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Dexter");
        list.add("Mauro");
        list.add("Marcos");
        list.add("Josenias");

        for (String pessoa: list) {
            System.out.println(pessoa);
        }

        System.out.println("-------------------------------");

        list.removeIf(pessoa -> pessoa.charAt(0) == 'M');
        for (String pessoa : list) {
            System.out.println(pessoa);
        }

        System.out.println("-------------------------------");

        List<String> resultList = list.stream().filter(pessoa -> pessoa.charAt(0) == 'J').toList();
        for (String pessoa : resultList) {
            System.out.println(pessoa);
        }

        read.close();
    }
}
