package com.spark.JPADemo.repo;

import com.spark.JPADemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByCourse(String course);

    // for custome query
    // select * from student;

    @Query(value = "select * from student", nativeQuery = true)
    List<Student> getAllStudent();
}
