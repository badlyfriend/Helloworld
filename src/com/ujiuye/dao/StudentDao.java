package com.ujiuye.dao;

import com.ujiuye.pojo.Student;
import com.ujiuye.utils.MyUtil;

import java.sql.SQLException;

/**
 * @Author Bob
 * @Create 2021-07-18-19:03
 */
public class StudentDao {
    private MyUtil myUtil = new MyUtil();
    public int insertStudent(Student s) {
        String sql = "insert into student values(?,?,?,?,?,?)";
        Object[] obj = {null,s.getSname(),s.getSex(),s.getSbir(),s.getHobby(),s.getPhoto()};
        try {
            return MyUtil.qr.update(sql,obj);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
}
