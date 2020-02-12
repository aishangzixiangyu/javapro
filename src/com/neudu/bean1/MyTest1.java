package com.neudu.bean1;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class MyTest1 {
    public static void main(String[] args) {
        File from = new File("d:/1 IO流介绍.wmv");
        File parent = new File("d:\\b");
        if(!parent.exists()){
            parent.mkdirs();
        }
        File to = new File("d:/b/"+from.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] c = new byte[1024];
        try {
             inputStream = new FileInputStream(from);
             outputStream = new FileOutputStream(to);
             int len = inputStream.read(c);
             while (len != -1){
                 /*写入文件流为止，不多输出*/
                 outputStream.write(c,0,len);
                 outputStream.flush();
                 len = inputStream.read(c);
             }
            System.out.println("复制成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(outputStream != null)
                    outputStream.close();
                if(inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
