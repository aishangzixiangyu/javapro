package com.neudu.test;

public class Person extends Animal {
    private int no;
    private char sex;


    public void add(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    public static int ride(int d, int e){
        int f = d * e;
        return f;
    }




    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex != '男' && sex != '女'){
            System.out.println("输出性别必须为男或女");
        }else{
            this.sex = sex;
        }

    }
}
