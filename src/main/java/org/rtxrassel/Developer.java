package org.rtxrassel;

public class Developer extends Employee{
    double bonus;

    public Developer(String name,double baseSalary,double bonus){
        super(name,baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    double employeCatagoris() {
        return 0;
    }

    @Override
    double finalSalary() {
        return 0;
    }


}
