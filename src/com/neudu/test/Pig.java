package com.neudu.test;

public class Pig extends Animal {
    private char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public void run() {
        System.out.println("猪慢慢的跑");
    }
}
