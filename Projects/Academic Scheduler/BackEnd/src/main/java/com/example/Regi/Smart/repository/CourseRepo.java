package com.example.Regi.Smart.repository;


import com.example.Regi.Smart.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, String> {
}
