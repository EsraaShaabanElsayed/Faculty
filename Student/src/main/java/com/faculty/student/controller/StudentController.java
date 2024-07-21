package com.faculty.student.controller;

import com.faculty.student.model.Student;
import com.faculty.student.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<?>findByid(@PathVariable String id){
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("")
    public  ResponseEntity<?> findAll(){

        return ResponseEntity.ok(studentService.findAll());
    }

    @PostMapping("")
    public ResponseEntity<?> insert(@Valid @RequestBody Student entity){
        return ResponseEntity.ok(studentService.insertStudent(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody @Valid Student entity){
        return ResponseEntity.ok(studentService.updateStudent(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteByID(@PathVariable String id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Deleted successfully!");
    }
}
