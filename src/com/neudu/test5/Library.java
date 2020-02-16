package com.neudu.test5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static List<MyBook> len = new ArrayList();
    public static File file = new File("d:\\book");
    public static void main(String[] args){
        if(!file.exists()){
            inputData(len);
            save();
        }else{
            read();
        }

        menu();
    }
    public static void inputData(List<MyBook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入存书的数量:");
        int n = scanner.nextInt();
        for(int i = 0; i < n;i++){
            MyBook myBook = new MyBook("书名"+i,Double.valueOf(String.valueOf(i)),
                    "出版社"+i,"作者"+i,"书的编号"+i);
            books.add(myBook);
        }
    }
    public static void print(List<MyBook> books){
        for(int i = 0; i < books.size(); i++){
            System.out.println(books.get(i));
        }
        menu();
    }

    public static void searchName(List<MyBook> books,String name){
        for(int i = 0; i < books.size(); i++){
            MyBook myBook = books.get(i);
            if(myBook.getName().equals(name)){
                System.out.println(myBook);
                menu();
                return;
            }
        }
        System.out.println("此书不存在");
        menu();
    }
    public static void deleteName(List<MyBook> books,String name){
        for(int i = 0; i < books.size(); i++){
            MyBook myBook = books.get(i);
            if(myBook.getName().equals(name)){
                books.remove(i);
                System.out.println("此书删除成功");
                save();
                menu();
                return;
            }
        }
        System.out.println("没有此书,删除失败");
        menu();
    }
    public static void addBook(List<MyBook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("书名:");
        String name = scanner.next();
        System.out.println("价格:");
        Double price = scanner.nextDouble();
        System.out.println("出版社:");
        String press = scanner.next();
        System.out.println("作者:");
        String author = scanner.next();
        System.out.println("书的编号:");
        String bookISBN = scanner.next();
        MyBook myBook = new MyBook(name,price,press,author,bookISBN);
        books.add(myBook);
        save();
        menu();
    }

    public static void menu(){
        System.out.println("输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：输出所有");
        System.out.println("5：退出程序");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch(i){
            case 1:
                addBook(len);
                break;
            case 2:
                System.out.println("请输入要删除的书名：");
                String dname = scanner.next();
                deleteName(len,dname);
                break;
            case 3:
                System.out.println("请输入要查询的书名：");
                String sname = scanner.next();
                searchName(len,sname);
                break;
            case 4:
                print(len);
                break;
            case 5:
                System.exit(1);
                break;
        }
    }

    public static void save(){
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(len);
            oos.flush();
            os.flush();


        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(oos != null)
                    oos.close();
                if(os != null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void  read(){
        InputStream is = null;
        ObjectInputStream ois = null;
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            len = (List<MyBook>)ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            try {
                if(ois != null)
                    ois.close();
                if(is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
