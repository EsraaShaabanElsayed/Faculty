package com.facilty.enrollment.controller;

import com.facilty.enrollment.model.Enrollment;
import com.facilty.enrollment.service.Enrollmentservice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@Controller
@RequestMapping("/enrollment")
public class EnrollmenController {
    @Autowired
    private Enrollmentservice enrollementservice;

    @GetMapping("/{id}")
    public ResponseEntity<?> findByid(@PathVariable String id){
        return ResponseEntity.ok(enrollementservice.findById(id));
    }

    @GetMapping("")
    public  ResponseEntity<?> findAll(){

        return ResponseEntity.ok(enrollementservice.findAll());
    }

    @PostMapping("")
    public ResponseEntity<?> insert(@Valid @RequestBody Enrollment entity){
        return ResponseEntity.ok(enrollementservice.insertEnrollment(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody @Valid Enrollment entity){
        return ResponseEntity.ok(enrollementservice.updateEnrollment(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteByID(@PathVariable String id) {
        enrollementservice.deleteEnrollment(id);
        return ResponseEntity.ok("Deleted successfully!");
    }

}
