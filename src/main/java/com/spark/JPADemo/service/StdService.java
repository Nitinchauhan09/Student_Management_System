package com.spark.JPADemo.service;

import com.spark.JPADemo.entity.Student;
import com.spark.JPADemo.dao.StudentRequest;

import java.util.List;

public interface StdService {

    List<Student> getAllStudentByCourse(String course);

    Student saveStdData(StudentRequest studentRequest);

    void deleteStdData(int id);

    List<Student> getAllStudent();


}
