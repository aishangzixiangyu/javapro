package com.neudu.test5;

import java.io.Serializable;

public class MyBook implements Serializable {
    private static final long serialVersionUID = 3L;
    private String  name;
    private Double price;
    private String press;
    private String author;
    private String bookISBN;

    public MyBook(String name, Double price, String press, String author, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBN = bookISBN;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "MyBook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }
}
