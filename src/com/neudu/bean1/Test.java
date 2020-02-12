package com.neudu.bean1;

import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
       Student student = new Student();
       student.setId(6);
       student.setName("张三");
       student.setAge(22);
       student.setGrade("神级一班");

        File file = new File("d:/Test3.java");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.mkdir());
        /*System.out.println(file.delete());*/
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
