package com.neudu.bean;

public class MyTest1 {
    public static void main(String[] args) {
        SalariedEmployee s1 = new SalariedEmployee("张三",6000,6);
        System.out.println(s1.getSalary(6));
        HourlyEmployee h1 = new HourlyEmployee("李四",160,160,6);
        System.out.println(h1.getSalary(1));
        SalesEmployee s2 = new SalesEmployee("王五",100000,0.5,6);
        System.out.println(s2.getSalary(6));
    }
}
