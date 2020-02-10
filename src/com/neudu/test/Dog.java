package com.neudu.test;

public class Dog {
    private int age;
    private char sex;


    public void setAge(int age) {
        if(age < 0 || age>50){
            this.age = 1;
        }else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }


    public void setSex(char sex) {
        if(sex != '公' && sex != '母'){
            System.out.print("输入的必须是公或母");
        }else {
            this.sex = sex;
        }
    }
    public char getSex() {
        return sex;
    }
}
