package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println("Informe os números que deseja armazenar: ");
        int quantity = read.nextInt();
        read.nextLine();

        int[] numbers = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Informe um número: ");
            numbers[i] = read.nextInt();
        }
        //                      [0, 1] <- posicoes.
        //  numbers[0] = [2]    [2, 3] <- valores nas respectivas posicoes.
        //  greaterNumber recebe o valor 2.
        int greaterNumber = numbers[0];
        int greaterPosition = 0;
        for (int i = 0; i < quantity; i++) {
            //  Para i = 0 temos que o número na posição 0 é 2;
            //  numbers[0] > greaterNumber
            //           2 > 2 ? false

            //  Para i = 1 temos que o número na posição 1 é 3;
            //  numbers[1] > greaterNumber;
            //           3 > 2 ? true;
            if (numbers[i] > greaterNumber) {                       // p para posição e v para valor       [p=v]
                // Para condição true, greaterNumber que valia numbers[0=2] agora é sobrescrito por numbers[1=3].
                greaterNumber = numbers[i];         // p para posição e v para valor       [p=v]
                // Agora greaterPosition recebe uma nova posição com um novo valor, numbers[1=3].
                greaterPosition = i;
            }
        }
        System.out.println("O maior valor armazenado é "+ greaterNumber);
        System.out.println("A posição do maior número é a posição "+ greaterPosition);

        read.close();
    }
}
