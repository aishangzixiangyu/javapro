package com.neudu.bean1;

import java.io.*;

public class Test5 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(6);
        student.setName("张三");
        student.setAge(22);
        student.setGrade("神级一班");

        File file = new File("d:\\student");
        OutputStream outputStream = null;
        ObjectOutputStream os = null;
        try {
            outputStream = new FileOutputStream(file);
            os = new ObjectOutputStream(outputStream);
            os.writeObject(student);
            os.flush();
            outputStream.flush();
            System.out.println("保存完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(os != null)
                    os.close();
                if(outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
