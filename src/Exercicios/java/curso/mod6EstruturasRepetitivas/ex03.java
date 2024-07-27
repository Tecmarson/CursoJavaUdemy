package Exercicios.java.curso.mod6EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int quantidadeClientesAlcool = 0;
        int quantidadeClientesGasolina = 0;
        int quantidadeClientesDiesel = 0;


        System.out.print("""
                Informe o tipo de combustível abastecido:
                
                Opções 
                1. Álcool
                2. Gasolina
                3. Diesel
                4. fim
                
                Digite aqui: 
                """);

        int tipoCombustivel = read.nextInt();

        while (tipoCombustivel != 4) {
            if (tipoCombustivel == 1) {
                System.out.println("Digite aqui: ");
                quantidadeClientesAlcool++;
                tipoCombustivel = read.nextInt();
            } else if (tipoCombustivel == 2) {
                System.out.println("Digite aqui: ");
                quantidadeClientesGasolina++;
                tipoCombustivel = read.nextInt();
            } else if (tipoCombustivel == 3) {
                System.out.println("Digite aqui: ");
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