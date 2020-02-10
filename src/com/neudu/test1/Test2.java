package com.neudu.test1;

public class Test2 {
    public static void main(String[] args) {
        /*int  a = 10;
        method(a);
        System.out.println(a);*/

        Person a = new Person();
        a.setAge(10);
        method(a);
        System.out.println(a.getAge());
    }
    public static void method(int a){
        a = 100;
    }
    public static void method(Person a){
        a.setAge(100);
    }
}
