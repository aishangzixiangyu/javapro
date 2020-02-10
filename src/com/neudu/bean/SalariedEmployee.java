package com.neudu.bean;

public class SalariedEmployee extends ColaEmployee{
    private int monthsalary;

    public SalariedEmployee(String name,int monthsalary,int month){
        super(name,month);
        this.monthsalary = monthsalary;
    }
    @Override
    public double getSalary(int month){
       return monthsalary;
    }

}
