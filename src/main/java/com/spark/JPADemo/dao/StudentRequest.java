package com.spark.JPADemo.dao;

public class StudentRequest {

    private Integer id;

    private String name;

    private String course;

    private String address;

    private String dob;

    private String enrolementNum;

    public String getEnrolementNum() {
        return enrolementNum;
    }

    public void setEnrolementNum(String enrolementNum) {
        this.enrolementNum = enrolementNum;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
