package com.neudu.test3;

import java.util.ArrayList;
import java.util.List;

public class MyTest4 {
    public static void main(String[] args) {
        /*n个人围成一圈 依次报数  报到3 出列
        *计算出  最后剩下几个人
        * */
        System.out.println(baoshu(1000));
    }
    public static int baoshu(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        int m = 1;
        while(list.size() > 1){
            if(m != 3){
                int first = list.remove(0);
                list.add(first);
                m++;
            }else{
                list.remove(0);
                m = 1;
            }
        }
        return list.get(0);
    }
}
