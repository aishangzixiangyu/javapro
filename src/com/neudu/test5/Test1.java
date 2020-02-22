package com.neudu.test5;

public class Test1 {
    public static void main(String[] args){
        int[] array = {2,1,3,4,0,13,5,6,7,9,10};
        for(int i = 0; i < array.length-1; i++){
            int  flag = 0;
            for(int j = 0; j < array.length-1-i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag++;
                }
            }
            if(flag == 0){
                break;
            }
        }

        for(int a : array){
            System.out.println(a);
        }
    }
}
