package com.neudu.bean;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(){

    }
    public Rectangle(int width,int height,String color){
        super(color);
        this.width = width;
        this.height = height;

    }
    @Override
    public double getArea() {
       return width * height;
    }

    @Override
    public double getPer() {
      return (width+height)*2;
    }

    @Override
    public void showAll() {

        System.out.println("输出的面积为"+getArea()+"输出的周长为"+getPer()+"颜色"+getColor());
    }
}
