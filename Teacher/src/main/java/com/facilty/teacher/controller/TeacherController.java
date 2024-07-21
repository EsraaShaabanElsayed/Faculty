package com.facilty.teacher.controller;

import com.facilty.teacher.model.Teacher;
import com.facilty.teacher.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/{id}")
    public ResponseEntity<?>findByid(@PathVariable String id){
        return ResponseEntity.ok(teacherService.findById(id));
    }

    @GetMapping("")
    public  ResponseEntity<?> findAll(){

        return ResponseEntity.ok(teacherService.findAll());
    }

    @PostMapping("")
    public ResponseEntity<?> insert(@Valid @RequestBody Teacher entity){
        return ResponseEntity.ok(teacherService.insertTeacher(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody @Valid Teacher entity){
        return ResponseEntity.ok(teacherService.updateTeacher(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteByID(@PathVariable String id) {
        teacherService.deleteTeacher(id);
        return ResponseEntity.ok("Deleted successfully!");
    }
}
