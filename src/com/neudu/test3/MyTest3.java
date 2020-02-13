package com.neudu.test3;

public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(feibo(6));
    }
    public static int feibo(int  m){
        if(m == 1 || m == 2){
            return 1;
        }else{
            int f1 = 1;
            int f2 = 1;
            int sum = 0;
            for(int i = 3; i <= m; i++){
                sum = f1 + f2;
                f1 = f2;
                f2 = sum;
            }
            return sum;
        }
    }
}
