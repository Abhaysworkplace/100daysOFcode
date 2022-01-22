package com.daySix;

import java.time.LocalDate;

public class Employer {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employer(String name, double salary, int year,int month,int date) {
        this.name = name;
        this.salary = salary;
        this.hireDate=LocalDate.of(year,month,date);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
    public double raiseSalary(double obPer){
        return this.salary+=(this.salary*obPer)/100;
    }
}
class EmployerTestdrive{
    public static void main(String[] args) {
        Employer[] e=new Employer[3];
        e[0]=new Employer("Abhay Goyal",14_00_000,2012,12,5);
        e[1]=new Employer("Manav Mittal",3_00_000,2011, 1,11);
        e[2]=new Employer("Aarosh Agarwal",14_00_000,2012, 1, 7);

        for(Employer i:e)
            i.raiseSalary(5);

        for(Employer i:e)
            System.out.println("name = "+i.getName()
            +", salary = "+i.getSalary()
            +", Hire Date = "+i.getHireDate());

    }
}
