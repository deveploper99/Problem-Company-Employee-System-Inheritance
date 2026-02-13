package org.rtxrassel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(){
        Developer dev = new Developer("Rassel Hassan",20000,10000);
        Manager manager = new Manager("Akramul Hassan",30000,10000);

        Employee fulltimeEmployee = new FullTime("Rakib Hassan",1000);
        System.out.println("Employee Name: "+fulltimeEmployee.getName());
        System.out.println("Employee base Salary: "+fulltimeEmployee.getSalary());
        System.out.println("Employee Tax: "+fulltimeEmployee.employeCatagoris());
        System.out.println("Employee Final Salary: "+fulltimeEmployee.finalSalary());


        Employee partTimeEmployee = new PartTime("Siam Ahmed",50000);
        System.out.println("P Employee name: "+partTimeEmployee.getName());
        System.out.println("P Employee Base Salary : "+partTimeEmployee.getSalary());
        System.out.println("P Employee Tax: "+partTimeEmployee.employeCatagoris());
        System.out.println("P Employee final Salary: "+partTimeEmployee.finalSalary());
    }
    }



