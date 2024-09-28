package com.spark.JPADemo.controller;

import com.spark.JPADemo.entity.Student;
import com.spark.JPADemo.service.StdService;
import com.spark.JPADemo.dao.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StdService stdService;

    @GetMapping("/get/{course}")
    public List<Student> getStudentByCourse(@PathVariable String course){
        return stdService.getAllStudentByCourse(course);
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody StudentRequest studentRequest){
        return stdService.saveStdData(studentRequest);

    }

    @DeleteMapping("/delete/{id}")
    public void saveStudent(@PathVariable int id){
        stdService.deleteStdData(id);

    }

    @GetMapping("/getall")
    public List<Student> getAllStudent(){
        return stdService.getAllStudent();

    }


}
