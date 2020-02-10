package com.neudu.test;

public class Test {
    public static void main(String[] args) {
         Pig p1 = new Pig();
         p1.setAge(10);
         p1.setSex('公');
         System.out.println(p1.getSex());
         p1.run();
         System.out.println(p1.getAge());
         Cat c1 = new Cat();
         c1.run();
         c1.setName("花王");
         System.out.println(c1.getName());
         /*Student s1 = new Student();
         s1.setName("请叫我大王");
         System.out.println(s1.getName());*/

         /*重写和重载有哪些区别
         *
         *
         * */
    }
}
