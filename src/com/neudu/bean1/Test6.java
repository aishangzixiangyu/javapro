package com.neudu.bean1;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        File file = new File("d:\\student");
        InputStream inputStream = null;
        ObjectInputStream oos = null;
        try {
            inputStream = new FileInputStream(file);
            oos = new ObjectInputStream(inputStream);
            Student student = (Student)oos.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            try {
                if(oos != null)
                    oos.close();
                if(inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
