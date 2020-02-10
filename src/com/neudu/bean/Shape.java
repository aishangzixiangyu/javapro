package com.neudu.bean;

public abstract class Shape {
    private int area;
    private int per;
    private String color;

    public String getColor() {
        return color;
    }

    /*public void setColor(String color) {
        this.color = color;
    }*/

    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();

    public Shape(){

    }
    public Shape(String color){
        this.color = color;
    }
}
