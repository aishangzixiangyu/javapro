package com.neudu.bean1;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("d:\\Test.java");
        Reader reader = null;
        BufferedReader br = null;
        char[] a = new char[10];
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String str = br.readLine();
            while (str != null){
                System.out.println(str);
                str = br.readLine();
            }
            /*int b = reader.read(a);
            while(b != -1){
                System.out.println("读取字符数:"+b);
                System.out.println(new String(a,0,b));
                b = reader.read(a);
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if(br != null)
                    br.close();
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
