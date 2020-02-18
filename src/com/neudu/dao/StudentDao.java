package com.neudu.dao;

import com.neudu.pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IStudentDao{
    String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
    String username = "root";
    String password = "123456";
    @Override
    public List<Student> query() {
        List<Student> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con = DriverManager.getConnection(url,username,password);
            //创建命令行 写sql语句
            pstmt = con.prepareStatement("select id,name,age from student ");
            //执行sql语句
            //如果是查询 调用excuteQuery方法 返回一个Resultset 结果集
            rs = pstmt.executeQuery();
            /*ResultSet 每次调用 next()方法的时候 会做两件事
              1 看一下有没有下一行 如果没有 返回false
              2 如果有 将游标推向下一行 返回true
            */
            while(rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                list.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                if(rs != null)
                   rs.close();
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    @Override
    public int add(Student student) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con = DriverManager.getConnection(url,username,password);
            //创建命令行 写sql语句
            pstmt = con.prepareStatement("insert into student(name,age) values (?,?)");
            //设置问号的值
            pstmt.setString(1,student.getName());
            pstmt.setInt(2,student.getAge());

            i = pstmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int update(Student student) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con = DriverManager.getConnection(url,username,password);
            //创建命令行 写sql语句
            pstmt = con.prepareStatement("update student set name=?,age=? where id=?");
            //设置问号的值
            pstmt.setString(1,student.getName());
            pstmt.setInt(2,student.getAge());
            pstmt.setInt(3,student.getId());

            i = pstmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public int del(int id) {
        int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con = DriverManager.getConnection(url,username,password);
            //创建命令行 写sql语句
            pstmt = con.prepareStatement("delete from student where id=?");
            //设置问号的值
            pstmt.setInt(1,id);

            i = pstmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public Student queryone(int id) {
        return null;
    }
}
