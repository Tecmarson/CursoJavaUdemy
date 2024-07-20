package Exercicios.java.curso.modulo6;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int quantidadeClientesAlcool = 0;
        int quantidadeClientesGasolina = 0;
        int quantidadeClientesDiesel = 0;


        System.out.println("""
                Informe o tipo de combustível abastecido:
                
                Opções 
                1. Álcool
                2. Gasolina
                3. Diesel
                4. fim
                """);

        int tipoCombustivel = read.nextInt();

        while (tipoCombustivel != 4) {
            if (tipoCombustivel == 1) {
                quantidadeClientesAlcool++;
                tipoCombustivel = read.nextInt();
            } else if (tipoCombustivel == 2) {
                quantidadeClientesGasolina++;
                tipoCombustivel = read.nextInt();
            } else if (tipoCombustivel == 3) {
                quantidadeClientesDiesel++;
                tipoCombustivel = read.nextInt();
            }
        }

        System.out.println("Álcool: "  + quantidadeClientesAlcool);
        System.out.println("Gasolina: "  + quantidadeClientesGasolina);
        System.out.println("Diesel: "  + quantidadeClientesDiesel);


        read.close();
    }
}
