package Exercicios.java.curso.mod12EnumsEComposicao;

import Exercicios.java.curso.mod12EnumsEComposicao.Entities.Order;
import Exercicios.java.curso.mod12EnumsEComposicao.EntitiesEnums.OrderStatus;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        Order order = new Order(1, new Date(), OrderStatus.valueOf("DELIVERED"));

        System.out.println(order);
    }
}
