package com.neudu.test;

public class MyTest4 {
    public static void main(String[] args) {
        /*求最大公约数和最小公倍数*/
        int m = 15;
        int n = 30;
        int max = 1;
        int min = max1(m,n);
        for(int i = 1; i <= m && i <= n; i++){
            if(m%i == 0 && n%i == 0){
                max = i;
            }
        }
        for(int i = min; i <= m*n; i++){
            if(i % m == 0 && i % n == 0){
                min = i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static int max1(int a,int b){
        return(a>b)? a : b;
    }
}
