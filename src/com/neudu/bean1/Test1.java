package com.neudu.bean1;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("d:\\Test.java");
        try {
            OutputStream outputStream = new FileOutputStream(file,true);
            String a = "\nasdfghjkl";
            outputStream.write(a.getBytes());//相当于管道
            outputStream.flush();//相当于把管道的东西送到最终地
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
