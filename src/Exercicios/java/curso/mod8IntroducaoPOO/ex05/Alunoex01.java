package Exercicios.java.curso.mod8IntroducaoPOO.ex05;

public class Alunoex01 {
    private String name;
    private double notaPrimeiroTrimeste;
    private double notaSegundoTrimeste;
    private double notaTerceiroTrimeste;


    public void setName(String name) {
        this.name = name;
    }

    public void setNotaPrimeiroTrimeste(double notaPrimeiroTrimeste) {
        this.notaPrimeiroTrimeste = notaPrimeiroTrimeste;
    }

    public void setNotaSegundoTrimeste(double notaSegundoTrimeste) {
        this.notaSegundoTrimeste = notaSegundoTrimeste;
    }

    public void setNotaTerceiroTrimeste(double notaTerceiroTrimeste) {
        this.notaTerceiroTrimeste = notaTerceiroTrimeste;
    }

    public double finalGrade() {
        return notaPrimeiroTrimeste + notaSegundoTrimeste + notaTerceiroTrimeste;
    }

    public double point() {
        return  60 -  finalGrade();
    }

    @Override
    public String toString() {
        StringBuilder outputFormated = new StringBuilder();
        if (finalGrade() >= 60) {
            outputFormated.append(String.format("Final Grade: %.2f Pass!", finalGrade()));
        } else if(finalGrade() < 60) {
            outputFormated.append(String.format("Final Grade: %.2f Failed! %n ", finalGrade()));
            outputFormated.append(String.format("Missing: %.2f points", point()));
        }

        return outputFormated.toString();
    }
}
