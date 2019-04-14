package com.example.demo.pojo;


import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键选择自增方式
    private int uid;

    @Column(name = "uname")
    private String uname;

    public User(String uname) {
        this.uname = uname;
    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
