package com.neudu.test5;

public class Test2 {
    public static void main(String[] args){
        int[] array1 = {1,0,2,3,5,6,8,12,10};
        for(int i = 0; i < array1.length-1; i++){
            for(int j = i+1; j < array1.length; j++){
                if(array1[i] > array1[j]){
                    int temp = array1[j];
                    array1[j] = array1[i];
                    array1[i] = temp;
                }
            }
        }
        for(int b : array1){
            System.out.println(b);
        }
    }
}
