package com.keer.tai_ji_demo.pojo;

import javax.persistence.*;

/**
 * @BelongsProject: tai_ji_demo
 * @BelongsPackage: com.keer.tai_ji_demo.pojo
 * @Author: keer
 * @CreateTime: 2020-04-26 13:22
 * @Description: 学生实体
 */
@Entity(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "school",nullable = false)
    private String school;
    @Column(name="address",nullable = false)
    private String address;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
