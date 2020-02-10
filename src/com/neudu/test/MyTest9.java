package com.neudu.test;

public class MyTest9 {
    public static void main(String[] args) {
        /*二分法搜索*/
        int[] array = new int[100000];
        for(int i = 0; i < array.length; i++ ){
            array[i] = i + 1;
        }
        int a = 6000;
        int index = find(array,a);
        System.out.println(index);
    }
    public static int find(int[] array, int value){
        int min = 0;
        int max = array.length-1;
        int mid;
        int count = 0;
        while(min <= max){
            count++;
            mid = (max+min)/2;
            if(value == array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if(value > array[mid]){
                min = mid + 1;
            }else{
                max = mid - 1;
            }
        }
        return -1;
    }

}
