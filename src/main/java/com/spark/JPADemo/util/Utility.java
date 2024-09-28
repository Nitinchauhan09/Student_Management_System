package com.spark.JPADemo.util;

import com.spark.JPADemo.dao.StudentRequest;
import com.spark.JPADemo.entity.Student;

public class Utility {

    public static Student Mapper(StudentRequest studentRequest){
        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setCourse(studentRequest.getCourse());
        student.setAddress(studentRequest.getAddress());

        return student;

    }
}
