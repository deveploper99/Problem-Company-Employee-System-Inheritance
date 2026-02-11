package org.rtxrassel;

public class FullTime extends Employee{

    public FullTime(String name, double baseSalary)
    {
        super(name, baseSalary);
    }

    @Override
    double employeCatagoris() {
        return  baseSalary*0.10;
    }

    @Override
    double finalSalary() {
        return baseSalary-employeCatagoris();
    }


}
