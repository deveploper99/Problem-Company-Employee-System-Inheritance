package org.rtxrassel;

public class PartTime extends Employee{


    public PartTime(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double employeCatagoris() {
        return baseSalary*0.20;
    }

    @Override
    double finalSalary() {
        return baseSalary-employeCatagoris();
    }


}
