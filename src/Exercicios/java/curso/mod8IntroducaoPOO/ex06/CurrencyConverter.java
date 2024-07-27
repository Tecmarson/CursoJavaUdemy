package Exercicios.java.curso.mod8IntroducaoPOO.ex06;

public class CurrencyConverter {
    public static final double taxIof = 0.06;

    public static double CoinConverter(double valuePaid, double coinPrice) {
        double value = valuePaid * coinPrice;
        double valueFinal = value * taxIof;
        double res = value + valueFinal;
        return res;
    }

}
