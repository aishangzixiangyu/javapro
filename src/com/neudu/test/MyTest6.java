package com.neudu.test;

public class MyTest6 {
    public static void main(String[] args) {
        /*冒泡排序法*/
        int [] array = {1,34,24,56,78,66,100,89};
        for(int i = 0; i < array.length-1; i++){
            int flag = 0;
            for(int j = 0; j < array.length-1-i; j++){
                if(array[j]>array[j+1]) {
                    /*定义一个新变量*/
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int a : array){
            System.out.println(a);
        }
    }
}
