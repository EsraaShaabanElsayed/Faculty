package com.facilty.course.controller;

import com.facilty.course.model.Course;
import com.facilty.course.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@Controller
@RequestMapping("/course")

public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findByid(@PathVariable String id){
        return ResponseEntity.ok(courseService.findById(id));
    }

    @GetMapping("")
    public  ResponseEntity<?> findAll(){

        return ResponseEntity.ok(courseService.findAll());
    }

    @PostMapping("")
    public ResponseEntity<?> insert(@Valid @RequestBody Course entity){
        return ResponseEntity.ok(courseService.insertCourse(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody @Valid Course entity){
        return ResponseEntity.ok(courseService.updateCourse(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteByID(@PathVariable String id) {
        courseService.deleteCourse(id);
        return ResponseEntity.ok("Deleted successfully!");
    }
}
