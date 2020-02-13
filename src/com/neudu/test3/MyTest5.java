package com.neudu.test3;

import java.util.ArrayList;
import java.util.List;

public class MyTest5 {
    public static void main(String[] args){
        System.out.println(method(1000));
    }

    public static int method(int a){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < a; i++){
            list.add(i);
        }
        int b = 1;
        while(list.size()>1){
            if(b != 3){
                int first = list.remove(0);
                list.add(first);
                b++;
            }else{
                list.remove(0);
                b = 1;
            }
        }
        return list.get(0);
    }
}
