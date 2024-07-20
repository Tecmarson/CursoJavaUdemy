package Exercicios.java.curso.modulo7;

public class MetodoParaFormatarStrings {
    public static void main(String[] args) {
        String original = "abcd FGRE ABDF ADrf kawW    ";

        String o1 = original.toLowerCase();
        String o2 = original.toUpperCase();
        String o3 = original.trim();
        String o4 = original.substring(2);
        String o5 = original.substring(4,7);
        String o6 = original.replace('a','y');
        int o = original.indexOf("b");
        int O = original.lastIndexOf("ef");

    }
}
