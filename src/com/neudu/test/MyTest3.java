package com.neudu.test;

public class MyTest3 {
    public static void main(String[] args) {
        /*
         * 从1到4中的数，任意取三个数 最后组成多少个三位数，并打印出来
         * */
        /*int [] array = {1,2,3,4};
        for(int i : array){
            for(int j : array){
               if(i!=j){
                   for(int k : array){
                       if(i!= k&& j!=k){
                           System.out.println(i*100+j*10+k);
                       }
                   }
               }
            }

        }*/
        /*从1到100的偶数和*/
        /*int sum= 0;
        for(int i = 1; i <= 100; i++){
            if(i%2==0){
               sum = sum + i;
            }
        }
        System.out.println(sum);*/
        /*定义两个int变量*/
        /*int m = 5;
        int n = 6;
        int sum = 1;
        for(int i =0; i < n; i++){
            sum = sum * m;
        }
        System.out.println(sum);*/
        /*水仙花的问题*/
        for(int i = 100; i <= 999; i++){
            int a = i/100;
            int b = i%100/10;
            int c =  i%10;
            if(i == (a*a*a)+(b*b*b)+(c*c*c)){
                System.out.println(i);
            }
        }
    }
}
