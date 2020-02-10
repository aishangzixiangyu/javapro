package com.neudu.test1;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
     /*
       我们分别用ArrayList和LinkedList  添加100万个元素
     *
     * 对比性能差异
     * 添加之前 获取一个当前时间  添加之后获取一个当前时间  添加之后-添加之前 = 用时
     *
     * 1 ArrayList和LinkedList 在尾部添加的时候，性能差不多
     * 2 ArrayList和LinkedList 在中间插入的时候，LinkedList的性能远高于ArrayList的性能
     * 3 ArrayList和LinkedList   在读取的时候，ArrayList的性能远高于LinkedList的性能
     * */
        List arraylist = new ArrayList();
        List linkedlist = new LinkedList();
        Date startarray = new Date();
        for(int i = 0; i < 100000; i++){
            arraylist.add(0,i);
        }
        Date endarray = new Date();
        System.out.println("ArrayList添加用时"+(endarray.getTime()-startarray.getTime()));

        Date startlinked = new Date();
        for(int i = 0; i < 100000; i++){
             linkedlist.add(0,i);
        }
        Date endlinked = new Date();
        System.out.println("LinkedList添加用时"+(endlinked.getTime()-startlinked.getTime()));

        Date startreadarray = new Date();
        for(int i = 0; i < arraylist.size(); i++){
            Object obj = arraylist.get(i);
        }
        Date endreadarray = new Date();
        System.out.println("ArrayList读取用时"+(endreadarray.getTime()-startreadarray.getTime()));

        Date startreadlink = new Date();
        for(int i = 0; i < linkedlist.size(); i++){
            Object obj = linkedlist.get(i);
        }
        Date endreadlink = new Date();
        System.out.println("LinkList读取用时"+(endreadlink.getTime()-startreadlink.getTime()));


    }
}
