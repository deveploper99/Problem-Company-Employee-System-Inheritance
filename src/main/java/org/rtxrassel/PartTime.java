package org.rtxrassel;

public class PartTime extends Employee{


    public PartTime(String name, double baseSalary) {
        super(name, baseSalary);
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
