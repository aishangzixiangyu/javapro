package com.neudu.test;

import java.lang.reflect.Method;

public class MyTest {
    public static void main(String[] args) {


        /*Dog d1 = new Dog();
        d1.setAge(25);
        d1.setSex('公');
        System.out.println(d1.getAge());
        System.out.println(d1.getSex());*/
        /*Person p1 = new Person();
        p1.setAge(60);
        p1.add(3,10);
        int sum = p1.ride(2,6);
        System.out.println(sum);*/

        /*int sum = Person.ride(2,3);
        System.out.println(sum);*/

        /*int age = p1.getAge();
        System.out.println(age);
        p1.setSex('男');
        System.out.println(p1.getSex());*/

        /*int year = 2020;
        if((year % 4 == 0 && year % 100 !=0)||(year % 400 == 0) ){
            System.out.println("该年份是闰年");
        }else{
            System.out.println("该年份不是闰年");
        }*/
        /*int sum = 0;
        int i = 1;*/
        /*for(int i = 1; i <= 100; i++){
            sum = sum + i;
        }*/
        /*while(i<=100){
            sum = sum + i;
            i++;
        }*/
       /* do{
            sum = sum + i;
            i++;
        }while(i<=100);
        System.out.println(sum);*/
       /*int sum = 0;
       for(int i = 2; i <= 100; i++){

       }*/
      /*int sum = 2 +3 +5 +7 +11 +13+ 17 +19+23+ 29+
        31 +37 +41 +43 +47 +53 +59 +61 +67 +71+
        73 +79 +83 +89 +97;
        System.out.println(sum);*/
      /*Person a = new Person();
      a.setAge(10);
      method(a);
      System.out.println(a.getAge());*/
      int a = 10;
      method(a);
      System.out.println(a);
    }
    public static void   method(int a){
        a = 100;
    }
    public static void method(Person a){
        a.setAge(100);
    }
}










