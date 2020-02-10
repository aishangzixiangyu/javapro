package com.neudu.test;

public class MyTest7 {
    public static void main(String[] args) {
        /*选择排序法*/
        int[] array = {1,5,6,7,3,2,8};
        for(int i = 0; i < array.length-1; i++){
            /*重要循环*/
            for(int j = i+1; j < array.length-1; j++){
                if(array[i]>array[j]){
                    /*定义一个变量*/
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for(int a : array){
            System.out.println(a);
        }
    }
}
