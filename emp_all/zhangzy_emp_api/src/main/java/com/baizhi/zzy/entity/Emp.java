package com.baizhi.zzy.entity;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private Date bir;
    private String address;

    public Emp() {
    }

    public Emp(Integer id, String name, Integer age, Date bir, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bir = bir;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bir=" + bir +
                ", address='" + address + '\'' +
                '}';
    }
}
