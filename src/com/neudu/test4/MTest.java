package com.neudu.test4;

public class MTest {
    public static void main(String[] args) {
      /*  MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();*/
       MyThread2 t2 = new MyThread2();
       Thread t = new Thread(t2);
       t.start();
    }
}
