package com.example.demo.pojo;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键选择自增方式
    private int pid;

    @Column(name = "pname")
    private String pname;

    @Column(name = "price")
    private Double price;

    @Column(name = "birthplace")
    private String birthplace;

    @Column(name = "number")
    private int number;

//    public Product(Double price, String name) {
//        this.id = -1L;
//        this.price = price;
//        this.name = name;
//    }

    //    hibernate需要一个空构造函数


    public Product() {
    }

    public Product(String pname, Double price, String birthplace, int number) {
        this.pname = pname;
        this.price = price;
        this.birthplace = birthplace;
        this.number = number;
    }

    /**
     * get,set
     * */

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
