package com.example.Regi.Smart.service;

import com.example.Regi.Smart.model.Course;
import com.example.Regi.Smart.model.CourseRegistry;
import com.example.Regi.Smart.repository.CourseRegistryRepo;
import com.example.Regi.Smart.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {


    @Autowired
    CourseRepo courseRepo;


    
    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name,String emailId, String courseName)
    {
        CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);
    }

}
