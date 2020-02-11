package com.neudu.test3;


import java.util.ArrayList;

/*
输出菜单项请选择你要进行的操作
1添加图书 2删除图书  3查找图书 4退出该程序*/
public class Mybook {
    private String name;
    private Double price;
    private String press;
    private String author;
    private String bookISBN;

    public Mybook(String name, Double price, String press, String author, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBN = bookISBN;
    }

    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public String getPress(){
        return press;
    }
    public String getAuthor(){
        return author;
    }
    public String getBookISBN(){
        return bookISBN;
    }

    @Override
    public String toString() {
        return "Mybook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }
}
