package com.neudu.test;

public class MyTest2 {
    public static void main(String[]args){

        /*for(int a : array){
            System.out.println(a);
        }*/
        /*for(int i = 0; i < array.length-1; i++){
            int a = array[i];
            System.out.println(a);
        }*/
        /*从1到4中  任意取三个数 最多能组成多少数  并打印*/
        /*int[]array = {1,2,3,4};
        for(int i = 0; i < array.length; i++){
            int a = array[i];
            for(int j = 0; j < array.length; j++){
                int b = array[j];
                for(int k = 0; k < array.length; k++){
                    int c = array[k];
                    if(a != b &&b != c&& a!=c){
                        System.out.println(a*100+b*10+c);
                    }
                }
            }
        }*/
        /*1到100间的偶数和*/
        /*int sum= 0;
        for(int i = 1; i <=100; i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);*/

        /*定义两个int变量 m n 计算m的n次方
        * */
        int m = 2;
        int n = 7;
        int sum = 1;
        for(int i = 0; i < n; i++){
            sum = sum * m ;
        }
        System.out.println(sum);
       /*水仙花问题*/
       /* for(int i = 100; i <= 999; i++){
           int a = i/100;
           int b = (i%100)/10;
           int c = i%10;
           if(i==(a*a*a)+(b*b*b)+(c*c*c)){
               System.out.println(i);
           }
        }*/


    }
}
