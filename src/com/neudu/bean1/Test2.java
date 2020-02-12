package com.neudu.bean1;


import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("d:\\Test.java");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] b = new byte[10];
            int a = inputStream.read(b);
            while(a != -1){
                System.out.println("读取字节数:"+b);
                System.out.println(new String(b,0,a));
                a = inputStream.read(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
