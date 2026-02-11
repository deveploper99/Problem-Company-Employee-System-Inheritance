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
        System.out.println("Employee Employe Final Salary: "+fulltimeEmployee.employeCatagoris());
    }
    }



