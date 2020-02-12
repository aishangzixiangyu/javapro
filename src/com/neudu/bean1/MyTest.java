package com.neudu.bean1;

import java.io.*;

public class MyTest {
    public static void main(String[] args) {
        //把D盘下的一个文件复制到a目录下
        File from = new File("d:\\timg.jpg");
        File parent = new File("d:/a");
        if(!parent.exists()){
            parent.mkdirs();
        }
        File to = new File("d:/a/"+from.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] b = new byte[1024];
        try {
             /*读取文件流*/
             inputStream = new FileInputStream(from);
             /*写入文件流*/
             outputStream = new FileOutputStream(to);
             int len = inputStream.read(b);
             while (len != -1){
                 /*写入文件流*/
                 outputStream.write(b,0,len);
                 /*压入文件流*/
                 outputStream.flush();
                 len = inputStream.read(b);
             }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
