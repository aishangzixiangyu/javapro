package com.neudu.bean;

public class Circle extends Shape{
    private double  radius;

    public Circle(){

    }

    public Circle(int  radius,String color ){
        super(color);
        this.radius= radius;
    }
    @Override
    public double  getArea(){
       double area = 3.14 * radius * radius;
       return area;
    }
    @Override
    public  double getPer(){
      double per = 2*3.14*radius;
      return per;
    }
    @Override
    public void showAll(){
        System.out.println("输出圆的面积"+getArea()+"输出圆的周长"+getPer()+"颜色"+getColor());
    }
}
