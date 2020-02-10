package com.neudu.test;

public class MyTest8 {
    public static void main(String[] args) {
        /*二分搜索法
        * 前提：数组一定得有序
        * */
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int a = 5;
        int index = search(array,a);
        System.out.println(index);
    }
    public static int search(int[] array,int value){
        int min = 0;
        int max = array.length-1;
        int mid;
        int count = 0;
        while(min <= max){
            count++;
            mid = (max+min)/2;
            if(value == array[mid]){
                System.out.println("查找了"+count+"次");
                return value;
            }else if(value < array[mid]){
                max = mid - 1;
            }else{
                min = mid +1;
            }
        }
        return -1;
    }
}
