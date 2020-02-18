package com.neudu.service;

import com.neudu.pojo.Student;

import java.util.List;

public interface IStudentService {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int id);
    Student queryone(int id);
}
