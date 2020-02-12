package com.neudu.bean1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("d:/Test.java");
        Writer writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write("qwertyuiop");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
