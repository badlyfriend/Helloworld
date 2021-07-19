package com.ujiuye.pojo;

/**
 * @Author Bob
 * @Create 2021-07-18-19:03
 */
public class Student {
    private int sid;
    private String sname;
    private int sex;
    private String sbir;
    private String hobby;
    private String photo;

    public Student() {
    }

    public Student(String sname, int sex, String sbir, String hobby) {
        this.sname = sname;
        this.sex = sex;
        this.sbir = sbir;
        this.hobby = hobby;
    }

    public Student(String sname, int sex, String sbir, String hobby, String photo) {
        this.sname = sname;
        this.sex = sex;
        this.sbir = sbir;
        this.hobby = hobby;
        this.photo = photo;
    }

    public Student(int sid, String sname, int sex, String sbir, String hobby, String photo) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.sbir = sbir;
        this.hobby = hobby;
        this.photo = photo;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSbir() {
        return sbir;
    }

    public void setSbir(String sbir) {
        this.sbir = sbir;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex=" + sex +
                ", sbir='" + sbir + '\'' +
                ", hobby='" + hobby + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
