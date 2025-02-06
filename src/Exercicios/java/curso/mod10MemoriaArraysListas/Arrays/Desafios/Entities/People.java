package Exercicios.java.curso.mod10MemoriaArraysListas.Arrays.Desafios.Entities;

public class People {
    private String Name;
    private Integer age;
    private Double height;
    private String gender;
    private Double firstNote;
    private Double secondNote;

    public People() {}

    public People(String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public People(Double height, String gender) {
        this.height = height;
        this.gender = gender;
    }

    public People(String name, Double firstNote, Double secondNote) {
        Name = name;
        this.firstNote = firstNote;
        this.secondNote = secondNote;
    }

    public People(String name, Integer age, Double height) {
        Name = name;
        this.age = age;
        this.height = height;
    }

    public Double getFirstNote() {
        return firstNote;
    }

    public Double getSecondNote() {
        return secondNote;
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

    public String getGender() {
        return gender;
    }



    @Override
    public String toString() {

        StringBuilder stringFormated = new StringBuilder();

        stringFormated.append(getName());

        return stringFormated.toString();
    }
}
