package org.rtxrassel;

public abstract class Employee {
     String name;
     double baseSalary;

    public Employee(String name,double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return baseSalary;
    }

    public double calculateSalary(){
        return baseSalary;
    }

    abstract double employeCatagoris();
    abstract double finalSalary();
}
