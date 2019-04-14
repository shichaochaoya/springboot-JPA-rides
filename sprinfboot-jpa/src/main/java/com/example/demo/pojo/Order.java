package com.example.demo.pojo;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "order_")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键选择自增方式
    private Integer oid;
    @Column(name = "uid")
    private Integer uid;
    @Column(name = "pid")
    private Integer pid;
    @Column(name = "number")
    private Integer number;
    @Column(name = "datetime")
    private Date datetime;

    public Order() {
    }

    public Order(Integer oid,Integer uid, Integer pid, Integer number, Date datetime) {
        this.oid = oid;
        this.uid = uid;
        this.pid = pid;
        this.number = number;
        this.datetime = datetime;
    }

    public Order(Integer uid, Integer pid, Integer number, Date datetime) {
        this.uid = uid;
        this.pid = pid;
        this.number = number;
        this.datetime = datetime;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
