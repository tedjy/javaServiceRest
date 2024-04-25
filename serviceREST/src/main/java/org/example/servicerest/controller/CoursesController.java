package org.example.servicerest.controller;

import org.example.servicerest.repository.CourseRepository;
import org.example.servicerest.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    private final CourseRepository coursesRepository;

    public CoursesController(CourseRepository coursesRepository) {

        this.coursesRepository = coursesRepository;
    }

    @GetMapping
    public Iterable<Courses> getAllCourses() {
        return coursesRepository.findAll();
    }
}
