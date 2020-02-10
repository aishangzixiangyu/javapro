package com.neudu.test;

public class MyArray {
    //作为存储数据的数组
    private int[] array;
    //作为实际放入数据的个数
    private int size;
    public MyArray(){
        size = 0;
        array = new int[10];
    }
    public int getSize(){
        return size;
    }

    public void add(int i){
        //如果存放的个数  大于 数组的长度  则需要扩大容量
        if(size >= array.length){
            //扩大容量的方式
            //定义一个长度更大的数组  把之前的数组复制进去 扩大1.5倍
            int []newarray = new int[size+size/2];
            for(int j = 0;j < array.length; j++){
               newarray[j] = array[j];
            }
            array = newarray;
            System.out.println("扩容完成，新数组长度为"+array.length);
        }
        array[size] = i;
        size++;
    }
    //通过下标取值
    public int get(int i){
        //取值范围从0到size-1
        if(i<0 || i >= size){
            System.out.println("索引出错");
            return -1;
        }
        return array[i];
    }
}
