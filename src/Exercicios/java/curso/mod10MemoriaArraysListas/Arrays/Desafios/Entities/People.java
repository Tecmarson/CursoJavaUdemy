package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios.Entities;

public class People {
    private String Name;
    private Integer age;
    private Double height;

    public People() {}

    public People(String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public People(String name, Integer age, Double height) {
        Name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }
}
