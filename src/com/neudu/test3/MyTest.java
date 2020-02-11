package com.neudu.test3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyTest {
    //定义数组
    public static List list= new ArrayList();
    public static void main(String[] args) {
        inputData(list);
        menu();
        /*deleteName(list,"书名为9");*/
        /*addBook(list);
        print(list);*/
    }
    public static void inputData(List<Mybook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入多少本书");
        int n = scanner.nextInt();
        for(int i = 0; i <= n; i++){
           Mybook mybook = new Mybook("书名为"+i,+Double.valueOf(String.valueOf(i)),
                   "出版社为"+i,"作者为"+i,"书的编号为"+i);
           books.add(mybook);
        }
    }
    public static void print(List<Mybook>books){
        for(int i = 0; i < books.size();i++){
            System.out.println(books.get(i));
        }
        menu();
    }
    public static void searchName(List<Mybook> books, String name){
        for(int i = 0; i < books.size(); i++){
            Mybook mybook = books.get(i);
            if(mybook.getName().equals(name)){
                System.out.println(mybook);
                menu();
                return;
            }
        }
        System.out.println("此书不存在,查找失败");
        menu();
    }
    public static void deleteName(List<Mybook> books, String name){
        for(int i = 0; i < books.size(); i++){
           Mybook mybook = books.get(i);
           if(mybook.getName().equals(name)){
               books.remove(i);
               menu();
               return;
           }
        }
        System.out.println("没有此书，查找失败");
        menu();
    }
    public static void addBook(List<Mybook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = scanner.next();
        System.out.println("请输入价格为：");
        double price = scanner.nextDouble();
        System.out.println("请输入出版社为");
        String press = scanner.next();
        System.out.println("请输入作者名字");
        String author = scanner.next();
        System.out.println("请输入书的编号为");
        String bookISBN = scanner.next();
        Mybook mybook = new Mybook(name,price,press,author,bookISBN);
        books.add(mybook);
        menu();
    }
    public static void menu(){
        System.out.println("输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：查找所有");
        System.out.println("5: 退出当前程序");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch(i){
            case 1:
                 addBook(list);
                 break;
            case 2:
                System.out.println("请输入书名:");
                String dname = scanner.next();
                deleteName(list,dname);
            case 3:
                System.out.println("请输入书名:");
                String searchname = scanner.next();
                searchName(list,searchname);
                break;
            case 4:
                print(list);
            default:
                System.exit(1);
        }
    }
}
