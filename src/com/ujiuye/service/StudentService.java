package com.ujiuye.service;

import com.ujiuye.dao.StudentDao;
import com.ujiuye.pojo.Student;

/**
 * @Author Bob
 * @Create 2021-07-18-19:04
 */
public class StudentService {

    private StudentDao sd = new StudentDao();

    public int insertStudent(Student student) {
        return sd.insertStudent(student);
    }
}
