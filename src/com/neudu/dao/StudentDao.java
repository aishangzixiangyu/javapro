package com.neudu.dao;

import com.neudu.pojo.Student;
import com.neudu.util.JdbcUtil;


import java.util.List;

public class StudentDao implements IStudentDao{
    @Override
    public List<Student> query() {
        return JdbcUtil.executeQuery("select id,name,age from student",Student.class);
    }
    @Override
    public int add(Student student) {
        return JdbcUtil.executeUpdate("insert into student(name,age) values (?,?)",student.getName(),student.getAge());
    }

    @Override
    public int update(Student student) {
        return JdbcUtil.executeUpdate("update student set name=?,age=? where id=?",student.getName(),student.getAge(),student.getId());
    }

    @Override
    public int del(int id) {
        return  JdbcUtil.executeUpdate("delete from student where id=?",id);
    }
}
