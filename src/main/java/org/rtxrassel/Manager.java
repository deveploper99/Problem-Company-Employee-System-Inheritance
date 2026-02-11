package org.rtxrassel;

public class Manager extends Employee{
    double allowance;

    public Manager(
            String name,
            double baseSalary,
            double allowance
    ){
        super(name,baseSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary(){
        return baseSalary+allowance;
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
