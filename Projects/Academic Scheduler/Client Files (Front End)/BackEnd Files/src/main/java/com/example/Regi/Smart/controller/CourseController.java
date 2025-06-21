package com.example.Regi.Smart.controller;


import com.example.Regi.Smart.model.Course;
import com.example.Regi.Smart.model.CourseRegistry;
import com.example.Regi.Smart.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")

public class CourseController {

    @Autowired
    CourseService courseService;


    @GetMapping("courses")
    public List<Course> availableCourses() {
        return courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }


    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName)
    {
        courseService.enrollCourse(name, emailId, courseName);
        return "Congratulations! "+name+" Enrollment Successful for "+courseName;

    }

}
