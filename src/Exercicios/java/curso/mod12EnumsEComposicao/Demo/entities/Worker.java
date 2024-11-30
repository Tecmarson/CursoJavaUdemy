package Exercicios.java.curso.mod12EnumsEComposicao.Demo.entities;

import Exercicios.java.curso.mod12EnumsEComposicao.Demo.entitiesEnums.WorkeLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkeLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorkeLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkeLevel getLevel() {
        return level;
    }

    public void setLevel(WorkeLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

   public void addContract(HourContract contract) {
        contracts.add(contract);
   }

   public void removeContract(HourContract contract) {
        contracts.remove(contract);
   }

   public Double income(Integer year, Integer mounth) {
        double sum = baseSalary;
       Calendar calendar = Calendar.getInstance();
        for (HourContract contract : contracts) {
            calendar.setTime(contract.getDate());
            int calendar_year = calendar.get(calendar.YEAR);
            int calendar_mounth = 1 + calendar.get(calendar.MONTH);
            if (year == calendar_year && mounth == calendar_mounth) {
                sum += contract.totalValue();
            }
        }
        return sum;
   }
}
