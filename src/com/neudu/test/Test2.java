package com.neudu.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
       /* Wang w1 = new Wang();
        w1.Teach();*/
        List l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
