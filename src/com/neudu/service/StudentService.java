package com.neudu.service;

import com.neudu.dao.IStudentDao;
import com.neudu.dao.StudentDao;
import com.neudu.pojo.Student;

import java.util.List;

public class StudentService implements IStudentService {
    IStudentDao studentDao = new StudentDao();
    @Override
    public List<Student> query() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int del(int id) {
        return studentDao.del(id);
    }

    @Override
    public Student queryone(int id) {
        return null;
    }
}
