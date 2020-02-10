package com.neudu.bean;

public class MyTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1,2,"蓝");

        r1.showAll();
        /*System.out.println(r1.getArea());*/
        Circle c1 = new Circle(2,"红");

       /* c1.setColor("红");
        System.out.println(c1.getColor());*/
        /*System.out.println(c1.getArea());*/
        c1.showAll();
    }
}
