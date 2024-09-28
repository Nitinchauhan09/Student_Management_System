package com.spark.JPADemo.service;

import com.spark.JPADemo.repo.StudentRepo;
import com.spark.JPADemo.entity.Student;
import com.spark.JPADemo.dao.StudentRequest;
import com.spark.JPADemo.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StdServiceImpl implements StdService{

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudentByCourse(String course) {
        return studentRepo.findByCourse(course);
    }

    @Override
    public Student saveStdData(StudentRequest studentRequest) {

        return studentRepo.save(Utility.Mapper(studentRequest));
    }

    @Override
    public void deleteStdData(int id) {
        studentRepo.deleteById(id);

    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.getAllStudent();
    }




}
