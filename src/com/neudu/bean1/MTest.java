package com.neudu.bean1;

import com.neudu.bean1.MyBook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MTest {
    public static MyBook[] myBooks = new MyBook[200];
    public static List list = new ArrayList();
    public static File file = new File("d:/books");
    public static void main(String[] args){

         if(!file.exists()){
             inputData(list);
             save();
         }else{
            read();
         }
         menu();
    }
    //放入书籍
    public static void inputData(List<MyBook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请放入需要存放的书籍:");
        int n = scanner.nextInt();
        for(int i = 0; i <= n; i++){
            MyBook myBook = new MyBook("书名"+i,Double.valueOf(String.valueOf(i)),
                    "出版社"+i,"作者"+i,"书的编号"+i);
            books.add(myBook);
        }
    }
    //打印书籍
    public static void print(List<MyBook> books){
        for(int i = 0; i < books.size();i++){
            System.out.println(books.get(i));
        }
        menu();
    }
    //通过书名来查找
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
    //通过书名来删除
     public static void deleteName(List<MyBook> books,String name){
        for(int i = 0; i < books.size(); i++){
            MyBook myBook = books.get(i);
            if(myBook.getName().equals(name)){
                books.remove(i);
                save();
                menu();
                return;
            }
        }
         System.out.println("没有此书,删除失败");
         menu();
     }
     //添加书籍
     public static void addBook(List<MyBook> books){
         Scanner scanner = new Scanner(System.in);
         System.out.println("请输入书名:");
         String name = scanner.next();
         System.out.println("请输入价格:");
         Double price = scanner.nextDouble();
         System.out.println("请输入出版社:");
         String press = scanner.next();
         System.out.println("请输入作者名字:");
         String author = scanner.next();
         System.out.println("请输入书的编号");
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
         System.out.println("4：删除图书");
         System.out.println("5：退出当前程序");
         Scanner scanner = new Scanner(System.in);
         int i = scanner.nextInt();
         switch(i){
             case 1:
                 addBook(list);
                 break;
             case 2:
                 System.out.println("请输入书名：");
                 String dname = scanner.next();
                 deleteName(list,dname);
                 break;
             case 3:
                 System.out.println("请输入书名：");
                 String searchname = scanner.next();
                 searchName(list,searchname);
                 break;
             case 4:
                 print(list);
                 break;
             case 5:
                 System.exit(1);
         }
     }
     //图书管理持久化
     public static void save(){
         OutputStream os = null;
         ObjectOutputStream oos = null;
         try {
             os = new FileOutputStream(file);
             oos = new ObjectOutputStream(os);
             oos.writeObject(list);
             oos.flush();
             os.flush();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }finally {
             try {
                 if(oos!=null)
                     oos.close();
                 if(os!=null)
                     os.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }

         }
     }

     //读取文件的内容
     public static void read(){
         InputStream is = null;
         ObjectInputStream ois = null;
         try {
              is = new FileInputStream(file);
              ois = new ObjectInputStream(is);
              list = (List<MyBook>)ois.readObject();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }finally{
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
