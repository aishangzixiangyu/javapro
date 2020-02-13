package com.neudu.test4;

import java.util.ArrayList;
import java.util.List;

public class MTest2 {
    /*public static  int a = 0;*/
    public static List list = new ArrayList();
    public static void main(String[] args) {

        /*MyInterface add = new MyAdd();
        MyInterface jian = new MyJian();
        MyInterface cheng = new MyCheng();
        MyInterface chu = new MyChu();
        System.out.println(method(10,2,add));*/

        /*System.out.println(method(10,2,(a,b)->{
            return a/b;
        }));*/
        /*System.out.println(method(9, 3, new MyInterface() {
            @Override
            public int method(int a, int b) {
                return a*b;
            }
        }));*/
        /*Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 100; i++){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"线程输出"+i);
                }
            }
        });
        t1.start();*/
        /*Thread t2 = new Thread(()->{
            for(int i = 0; i <= 10; i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程输出"+i);
            }
        });
        t2.start();*/
        for(int i = 0; i <= 5000; i++){
           Thread t = new Thread(()->{
               list.add(1);
           });
           t.start();
        }
        System.out.println(list.size());
    }
    public static int method(int a, int b,MyInterface myInterface){
        return myInterface.method(a,b);
    }
}
