package com.neudu.test;

public class Test3 {
    public static void main(String[] args){
        MyArray myarray = new MyArray();
        for(int i = 1; i <= 1000;i++){
             myarray.add(i);
        }

        System.out.println(myarray.getSize());
        for(int i = 0; i < myarray.getSize(); i++){
            System.out.println(myarray.get(i));
        }
    }
}
