package com.neudu.bean;

public class HourlyEmployee extends ColaEmployee{
    private int hoursalary;
    private int hour;

    public HourlyEmployee(String name,int hoursalary,int hour,int month){
        super(name,month);
        this.hoursalary = hoursalary;
        this.hour = hour;
    }
    @Override
    public double getSalary(int month){
        if(hour<=160){
            return hour * hoursalary;
        }else{
            return 160*hoursalary+(hour-160)*hoursalary*1.5;
        }

    }

}
